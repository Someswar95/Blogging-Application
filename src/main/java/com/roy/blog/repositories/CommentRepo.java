package com.roy.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roy.blog.models.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
