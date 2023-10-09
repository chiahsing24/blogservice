package com.codingjx.blogservice.service;

import com.codingjx.blogservice.payload.PostDto;
import com.codingjx.blogservice.payload.PostResponse;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);

    List<PostDto> getPostsByCategoryId(Long categoryId);
}
