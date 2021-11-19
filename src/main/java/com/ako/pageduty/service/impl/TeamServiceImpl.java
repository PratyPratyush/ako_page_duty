package com.ako.pageduty.service.impl;

import com.ako.pageduty.model.Developer;
import com.ako.pageduty.model.Message;
import com.ako.pageduty.model.RequestObject;
import com.ako.pageduty.model.Team;
import com.ako.pageduty.repository.DeveloperRepository;
import com.ako.pageduty.repository.TeamRepository;
import com.ako.pageduty.service.AlertService;
import com.ako.pageduty.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TeamServiceImpl implements TeamService {


    @Autowired
    DeveloperRepository developerRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    AlertService alertService;

    @Override
    public boolean insertTeamInfo(RequestObject requestObject) {
        Team  team = requestObject.getTeam();
        String teamId = teamRepository.insertTeam(team);
        List<Developer> developers = requestObject.getDevelopers();
        for(Developer developer : developers){
            developerRepository.insertDeveloper(developer);
        }
        return true;
    }

    @Override
    public boolean sendMessage(String teamId) {

        List<String> developerList = developerRepository.getDeveloperIds(teamId);
        int max = developerList.size()-1;
        int min = 0;
        int range = max - min + 1;
        int index = (int)(Math.random() * range) + min;
        try {
            String developerId = developerList.get(index);

        }catch (Exception e){

        }
        boolean status = alertService.sendMessage(buildMessage())
        return true;
    }
    public Message buildMessage(String title,String message,String to,String from){
        Message messageObj = new Message();
        messageObj.setMessage(message);
        messageObj.setId(UUID.randomUUID().toString());
        messageObj.setReceiveFrom(from);
        messageObj.setSendTo(to);
        messageObj.setTitle(title);
        return messageObj;
    }
}
