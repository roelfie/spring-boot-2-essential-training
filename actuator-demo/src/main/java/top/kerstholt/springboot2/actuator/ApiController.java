package top.kerstholt.springboot2.actuator;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * This class illustrates counting and timing with Micrometer.
 */
@RestController
@RequestMapping("api")
public class ApiController {

    private final PresidentRepository presidentRepository;
    private final Counter greetingCounter;

    public ApiController(PresidentRepository presidentRepository, MeterRegistry meterRegistry) {
        this.presidentRepository = presidentRepository;
        // This will add an endpoint: actuator/metrics/api.greeting
        this.greetingCounter = Counter.builder("api.greeting").register(meterRegistry);
    }

    @GetMapping("greeting")
    public String getGreeting(){
        greetingCounter.increment();
        return "Hello LinkedIn Learning Student";
    }

    // The Micrometer annotation (not the @Timed we created in the logging-timers project!)
    @Timed(value="api.getAllPresidents")
    @GetMapping("presidents")
    public List<President> getAllUSPresidents(){
        List<President> presidents = new ArrayList<>();
        this.presidentRepository.findAll().forEach(presidents::add);
        return presidents;
    }

}
