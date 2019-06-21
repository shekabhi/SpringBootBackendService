package com.gfg.abhishek.SpringBootBackendService.repository;

import com.gfg.abhishek.SpringBootBackendService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {


}
