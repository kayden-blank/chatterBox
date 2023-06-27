package com.chat.chatbox.controller;

import com.chat.chatbox.entity.Comment;
import com.chat.chatbox.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/post/{postId}")
    public List<Comment> getCommentsByPostId(@PathVariable long postId) {
        return commentService.getCommentsByPostId(postId);
    }

    @PostMapping("/post/{postId}")
    public Comment addComment(@PathVariable long postId, @RequestBody Comment comment) {
        comment.setPostId(postId);
        return commentService.addComment(comment);
    }
}
