package com.chat.chatbox.service;

import com.chat.chatbox.entity.Post;
import com.chat.chatbox.entity.User;
import com.chat.chatbox.response.LoginResponse;

import java.util.List;

public interface UserService {
    public List<User> getUser();

    public List<Post> getPost();

    public User addUser (User user);

    public Post addPost (Post post);

public void deleteById(Long id);
    public LoginResponse login(String email, String password);



}
