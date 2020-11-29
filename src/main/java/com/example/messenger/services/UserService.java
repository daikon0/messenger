package com.example.messenger.services;

import com.example.messenger.entities.Room;
import com.example.messenger.entities.User;
import com.example.messenger.objects.Friend;
import com.example.messenger.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUserById(int userId) {
        Optional<User> user = userRepository.findById(userId);
        return  user.get();
    }

    public List<Friend> findFriendList(List<Room> roomList, int userId) {
        ArrayList<Friend> friendList = new ArrayList<>();
        for (Room room : roomList) {
            Friend friend = new Friend();
            User user;
            if (room.getUserId() == userId) {
                user = this.findUserById(room.getFriendId());
            } else {
                user = this.findUserById(room.getUserId());
            }
            friend.setRoomId(room.getRoomId());
            friend.setName(user.getName());
            friendList.add(friend);
        }
        return friendList;
    }
}
