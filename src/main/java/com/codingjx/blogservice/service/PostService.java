package com.codingjx.blogservice.service;

import com.codingjx.blogservice.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(long id);
}
