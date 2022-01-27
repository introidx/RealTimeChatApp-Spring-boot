package com.introidx.RealTimeChatApp.controllers;

import com.introidx.RealTimeChatApp.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by PRAKASH RANJAN on 26-01-2022
 */

@RestController
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message) {

//        try {
//            //processing
////            Thread.sleep(2000);
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return message;
    }
}
