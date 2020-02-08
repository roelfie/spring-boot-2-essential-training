package top.kerstholt.springboot2.roomwebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.kerstholt.springboot2.aop.Timed;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomApiController {

    private RoomService roomService;

    public RoomApiController(RoomService roomService) {
        this.roomService = roomService;
    }

    @Timed
    @GetMapping("/rooms")
    public List<Room> getAllRooms() {
        return this.roomService.getAllRooms();
    }
}
