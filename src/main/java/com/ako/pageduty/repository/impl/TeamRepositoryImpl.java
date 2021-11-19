package com.ako.pageduty.repository.impl;

import com.ako.pageduty.model.Team;
import com.ako.pageduty.repository.TeamRepository;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class TeamRepositoryImpl implements TeamRepository {

    private Map<String,Team> teamMap = new HashMap<>();

    @Override
    public Team getTeamById(String id) {
        return null;
    }

    @Override
    public synchronized Team insertTeam(Team team) {
        if(team.getId()==null){
            team.setId(UUID.randomUUID().toString());
        }
        teamMap.put(team.getId(),team);
        return team;
    }
}
