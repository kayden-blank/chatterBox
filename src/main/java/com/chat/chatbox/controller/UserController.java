package com.chat.chatbox.controller;


import com.chat.chatbox.entity.Post;
import com.chat.chatbox.entity.User;
import com.chat.chatbox.response.LoginResponse;
import com.chat.chatbox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/all")
    public List<User> getUser(){
        return userService.getUser();
    }


    @GetMapping("/allPost")
    public List<Post> getPost(){
        return userService.getPost();
    }

    @PostMapping("/signUp")
    public  User signUp(@RequestBody User user){
        return  userService.addUser(user);
    }
    @PostMapping("/createPost")
    public  Post createPost(@RequestBody Post post){

        return  userService.addPost(post);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestParam String email, @RequestParam String password) {
        return userService.login(email, password);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
