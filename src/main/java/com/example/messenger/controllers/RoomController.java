package com.example.messenger.controllers;

import com.example.messenger.entities.Message;
import com.example.messenger.services.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class RoomController {
    private final MessageService messageService;

    @GetMapping("/user/{userId}/room/{roomId}")
    public String room(Model model, @PathVariable("userId") int userId, @PathVariable("roomId") int roomId) {
        List<Message> messages = messageService.findAllMessage(roomId);
        model.addAttribute("messages", messages);
        model.addAttribute("userId", userId);
        model.addAttribute("roomId", roomId);
        return  "room";
    }
}
