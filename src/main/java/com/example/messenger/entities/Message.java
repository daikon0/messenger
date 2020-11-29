package com.example.messenger.entities;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "messages")
public class Message {
    @Id
    @Column(name = "message_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageId;

    @Column(name = "room_id")
    private int roomId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "message_text")
    private String messageText;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
