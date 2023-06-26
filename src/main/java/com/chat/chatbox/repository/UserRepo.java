package com.chat.chatbox.repository;

import com.chat.chatbox.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String password);
}
