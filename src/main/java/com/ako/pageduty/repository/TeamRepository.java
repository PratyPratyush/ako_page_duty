package com.ako.pageduty.repository;


import com.ako.pageduty.model.Team;

public interface TeamRepository {
    public Team getTeamById(String id);
    public Team insertTeam(Team team);
}
