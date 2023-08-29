package com.codingjx.blogservice.service;

import com.codingjx.blogservice.payload.CommentDto;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);
}
