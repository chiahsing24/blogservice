package com.codingjx.blogservice.repository;

import com.codingjx.blogservice.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
