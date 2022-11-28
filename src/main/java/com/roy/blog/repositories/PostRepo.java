package com.roy.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roy.blog.models.Category;
import com.roy.blog.models.Post;
import com.roy.blog.models.User;

@Repository
public interface PostRepo extends JpaRepository<Post, Integer>{
	
	List<Post> findByuser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);

}
