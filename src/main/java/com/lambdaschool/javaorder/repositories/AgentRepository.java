package com.lambdaschool.javaorder.repositories;

import com.lambdaschool.javaorder.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long> {
}
