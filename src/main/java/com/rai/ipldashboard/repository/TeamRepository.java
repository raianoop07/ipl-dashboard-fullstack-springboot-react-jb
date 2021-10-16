package com.rai.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;
import com.rai.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {
    
    Team findByTeamName(String teamName);
}
