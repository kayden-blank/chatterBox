package com.chat.chatbox.service.implementation;

import com.chat.chatbox.entity.Post;
import com.chat.chatbox.entity.User;
import com.chat.chatbox.repository.PostRepo;
import com.chat.chatbox.repository.UserRepo;
import com.chat.chatbox.response.LoginResponse;
import com.chat.chatbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplementation implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PostRepo postRepo;






    @Override
    public List<User> getUser() {
        return userRepo.findAll();
    }
    @Override
    public List<Post> getPost() {
        return postRepo.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Post addPost(Post post) {
        return postRepo.save(post);

    }

    @Override
    public void deleteById(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public LoginResponse login(String email, String password) {
        User user = userRepo.findByEmailAndPassword(email, password);
        if (user != null) {
            // Login successful
            return new LoginResponse(true, "Login successful");
        } else {
            // Login failed
            return new LoginResponse(false, "Invalid email or password");
        }
    }


}
