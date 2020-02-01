package top.kerstholt.springboot.essentials.roomwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private static List<Room> rooms = new ArrayList<>();

    static{
        for(int i=0;i<10;i++){
            rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
        }
    }

    @GetMapping
    public String getAllRooms(Model model){     // The model is provided by Spring Web
        model.addAttribute("rooms", rooms);  // Populate model with data required by the returned view
        return "rooms";                         // Return the view name (Thymeleaf template, in this case)
    }
}
