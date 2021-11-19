package com.ako.pageduty.repository;


import com.ako.pageduty.model.Developer;

import java.util.List;

public interface DeveloperRepository {
    public Developer getDeveloperByName(String name);
    public Developer getRandomDeveloper(String teamId);
    public Developer insertDeveloper(Developer developer);
    List<String> getDeveloperIds(String teamId);
}
