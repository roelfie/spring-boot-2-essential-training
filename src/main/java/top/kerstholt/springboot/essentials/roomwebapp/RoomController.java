package top.kerstholt.springboot.essentials.roomwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping
    public String getAllRooms(Model model){     // The model is provided by Spring Web
        List<Room> rooms = this.roomService.getAllRooms();
        model.addAttribute("rooms", rooms);  // Populate model with data required by the returned view
        return "rooms";                         // Return the view name (Thymeleaf template, in this case)
    }
}
