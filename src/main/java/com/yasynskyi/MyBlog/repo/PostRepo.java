package com.yasynskyi.MyBlog.repo;

import com.yasynskyi.MyBlog.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
    void deletePostById(Long id);
}
