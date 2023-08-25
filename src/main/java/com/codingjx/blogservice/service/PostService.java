package com.codingjx.blogservice.service;

import com.codingjx.blogservice.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
