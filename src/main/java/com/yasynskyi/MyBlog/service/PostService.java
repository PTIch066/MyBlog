package com.yasynskyi.MyBlog.service;

import com.yasynskyi.MyBlog.Post;
import com.yasynskyi.MyBlog.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepo postRepo;

    @Autowired
    public PostService(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    public Post addPost(Post post){
        return postRepo.save(post);
    }

    public List<Post> findAllPosts(){
        return postRepo.findAll();
    }

    public Post updatePost(Post post){
        return postRepo.save(post);
    }

    public void deletePost(Long id){
        postRepo.deletePostById(id);
    }
}
