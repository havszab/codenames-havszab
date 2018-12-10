package com.codecool.havszab.codenames.repository;

import com.codecool.havszab.codenames.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InfoRepository extends JpaRepository<Info, Long> {


}