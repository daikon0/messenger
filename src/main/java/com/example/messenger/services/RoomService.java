package com.example.messenger.services;

import com.example.messenger.entities.Room;
import com.example.messenger.repositories.RoomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomService {
    private final RoomRepository roomRepository;

    public List<Room> findAllRoom(int userId) {
        List<Room> roomByUserId = roomRepository.findAllByUserId(userId);
        List<Room> roomByFriendId = roomRepository.findAllByFriendId(userId);
        roomByUserId.addAll(roomByFriendId);
        return roomByUserId;
    }
}
