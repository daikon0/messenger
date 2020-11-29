package com.example.messenger.objects;

import lombok.Data;

@Data
public class MessageForm {
    private int roomId;

    private int userId;

    private String messageText;
}
