package com.vrihas.simpleauth.authapplication.repository;

import com.vrihas.simpleauth.authapplication.bean.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

    ApplicationUser findByUsername(String username);
}
