package com.chat.chatbox.repository;

import com.chat.chatbox.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
