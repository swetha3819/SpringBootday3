package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ApiModel;

public interface ApiRepo extends JpaRepository<ApiModel, Integer>{

}
