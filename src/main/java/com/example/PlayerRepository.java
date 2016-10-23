package com.example;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource(path="players", rel="players")  // @RestResources is used such that there is no need to controllers and services.
public interface PlayerRepository extends CrudRepository<Player, Long>{

}
