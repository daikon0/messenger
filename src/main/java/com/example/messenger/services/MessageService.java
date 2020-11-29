package com.example.messenger.services;

import com.example.messenger.entities.Message;
import com.example.messenger.objects.MessageForm;
import com.example.messenger.repositories.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public List<Message> findAllMessage(int roomId) {
        return messageRepository.findAllByRoomId(roomId);
    }
}
