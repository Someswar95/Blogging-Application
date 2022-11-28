package com.roy.blog.services;

import com.roy.blog.playloads.CommentDto;

public interface CommentService {

	//create comment
	CommentDto createComment(CommentDto commentDto, Integer postId);
	
	//delete comment
	void deleteComment(Integer commentId);
	
}
