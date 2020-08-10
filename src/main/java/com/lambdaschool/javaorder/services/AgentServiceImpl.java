package com.lambdaschool.javaorder.services;


import com.lambdaschool.javaorder.models.Agent;
import com.lambdaschool.javaorder.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "agentService")
public class AgentServiceImpl implements AgentServices {
    @Autowired
    private AgentRepository agentrepos;


    @Override
    public Agent save(Agent agent) {
        return agentrepos.save(agent);
    }
}