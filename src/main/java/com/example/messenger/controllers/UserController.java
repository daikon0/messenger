package com.example.messenger.controllers;

import com.example.messenger.entities.Room;
import com.example.messenger.objects.Friend;
import com.example.messenger.services.RoomService;
import com.example.messenger.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final RoomService roomService;

    @GetMapping("/user/{userId}")
    public String user(Model model, @PathVariable("userId") int userId) {
        List<Room> roomList = roomService.findAllRoom(userId);
        List<Friend> friendList = userService.findFriendList(roomList, userId);
        model.addAttribute("userId", userId);
        model.addAttribute("friendList", friendList);
        return "user";
    }
}