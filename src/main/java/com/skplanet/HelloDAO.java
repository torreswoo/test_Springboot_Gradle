package com.skplanet;

import org.springframework.data.jpa.repository.JpaRepository;


public interface HelloDAO extends JpaRepository <Hello, Integer> {

}