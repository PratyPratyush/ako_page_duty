package com.ako.pageduty.service;

import com.ako.pageduty.model.Message;
import com.ako.pageduty.model.RequestObject;

public interface TeamService {
    boolean insertTeamInfo(RequestObject requestObject);
    boolean sendMessage(String teamID);
}
