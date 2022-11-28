package com.roy.blog.playloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {

	private int categoryId;
	private String categoryTitle;
	private String categoryDescription;

}
