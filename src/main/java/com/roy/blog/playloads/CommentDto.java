package com.roy.blog.playloads;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CommentDto {

	private int CommentId;
	
	private String content;
}
