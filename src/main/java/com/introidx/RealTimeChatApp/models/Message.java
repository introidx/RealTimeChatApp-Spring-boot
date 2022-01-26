package com.introidx.RealTimeChatApp.models;

/**
 * Created by PRAKASH RANJAN on 26-01-2022
 */
public class Message {
    private String name;
    private String content;

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
