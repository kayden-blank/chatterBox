package com.chat.chatbox.service.implementation;

import com.chat.chatbox.entity.Comment;
import com.chat.chatbox.repository.CommentRepository;
import com.chat.chatbox.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> getCommentsByPostId(long postId) {
        return commentRepository.findByPostId(postId);
    }

    @Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }

}
