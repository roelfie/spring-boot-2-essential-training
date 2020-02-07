package top.kerstholt.springboot2.roomclr;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Disabled("Requires a running RabbitMQ and room-web-app. And even then it fails.")
@SpringBootTest
class RoomCleaningCLRApplicationTests {

	@Test
	void contextLoads() {
	}

}
