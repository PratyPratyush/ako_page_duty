package com.ako.pageduty.repository.impl;

import com.ako.pageduty.model.Developer;
import com.ako.pageduty.model.Team;
import com.ako.pageduty.repository.DeveloperRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DeveloperRepositoryImpl implements DeveloperRepository {
    private Map<String, Developer>  developerMap = new HashMap<>();
    private Map<String, List<String>> developerTeamMap = new HashMap<>();

    @Override
    public Developer getDeveloperByName(String name) {

        return null;
    }

    @Override
    public Developer getRandomDeveloper(String teamId) {
        return null;
    }

    @Override
    public synchronized Developer insertDeveloper(Developer developer) {
        if(developer.getId()==null){
            developer.setId(UUID.randomUUID().toString());
        }
        developerMap.put(developer.getId(), developer);

        List<String> developerAndTeams =
                developerTeamMap.getOrDefault(developer.getTeam_id(),new ArrayList<>());

        developerAndTeams.add(developer.getId());
        developerTeamMap.put(developer.getTeam_id(),developerAndTeams);
        return developer;
    }

    @Override
    public List<String> getDeveloperIds(String teamId) {
        List<String> developers = new ArrayList<>();
        if(teamId!=null && developerTeamMap.containsKey(teamId)){
            developers = developerTeamMap.get(teamId);
        }
        return developers;
    }
}
