package com.example.messenger.repositories;

import com.example.messenger.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {
    List<Room> findAllByUserId(int userId);
    List<Room> findAllByFriendId(int userId);
}
