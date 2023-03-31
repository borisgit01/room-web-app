package com.boris.rwa.controllers;

import com.boris.rwa.models.House;
import com.boris.rwa.models.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/houses")
public class HouseController {
    private static final List<House> houses = new ArrayList<>();
    static {
        for(int i=0;i<10;i++) {
            houses.add(new House(i, "House" + i, "H" + i, "2 story"));
        }
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("houses", houses);
        return "houses";
    }
}
