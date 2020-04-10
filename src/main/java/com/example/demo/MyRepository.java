package com.example.demo;

import org.springframework.data.neo4j.annotation.Depth;
import org.springframework.data.neo4j.repository.Neo4jRepository;

@SuppressWarnings("unused")
public interface MyRepository extends Neo4jRepository<MyEntity, Long> {

    MyEntity findByName(String name);

    MyEntity findByName(String name, @Depth int depth);

}
