package com.ako.pageduty.model;

import lombok.Data;

@Data
public class Message {
    private String id;
    private String sendTo;
    private String receiveFrom;
    private String message;
    private String title;
}
