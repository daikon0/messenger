package com.example.messenger.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "rooms")
public class Room {
    @Id
    @Column(name = "room_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int roomId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "friend_id")
    private int friendId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
