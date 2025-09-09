package com.justChat.JustChat.controller;

import com.justChat.JustChat.model.ChatMessege;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessege sendMessage(ChatMessege messege) {
        return messege;
    }

    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
