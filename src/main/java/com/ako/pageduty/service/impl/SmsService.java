package com.ako.pageduty.service.impl;

import com.ako.pageduty.model.Message;
import com.ako.pageduty.service.AlertService;
import org.springframework.stereotype.Service;

@Service
public class SmsService implements AlertService {
    @Override
    public boolean sendMessage(Message message) {
        //
        return false;
    }
}
