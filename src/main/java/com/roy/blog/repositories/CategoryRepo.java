package com.roy.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roy.blog.models.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
