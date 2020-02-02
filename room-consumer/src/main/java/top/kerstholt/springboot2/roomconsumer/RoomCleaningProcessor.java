package top.kerstholt.springboot2.roomconsumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RoomCleaningProcessor {

    private final ObjectMapper objectMapper;
    private static final Logger LOGGER = LoggerFactory.getLogger(RoomCleaningProcessor.class);

    @Autowired
    public RoomCleaningProcessor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public void receiveMessage(String json) {
        LOGGER.info("Message received!");
        try {
            Room room = this.objectMapper.readValue(json, Room.class);
            LOGGER.info("Room ready for cleaning: " + room.getName());
        } catch (IOException e) {
            LOGGER.error("Exception caught! " + e.getMessage());
        }
    }
}
