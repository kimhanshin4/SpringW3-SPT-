package com.sparta.springauth.repository;

import com.sparta.springauth.entity.*;
import java.util.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {//DB에서 연결 준비

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);
}
