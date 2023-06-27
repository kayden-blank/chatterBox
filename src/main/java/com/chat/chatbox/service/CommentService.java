package com.chat.chatbox.service;

import com.chat.chatbox.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentsByPostId(long postId);
    Comment addComment(Comment comment);
}
