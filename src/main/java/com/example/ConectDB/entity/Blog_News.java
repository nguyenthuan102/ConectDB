package com.example.ConectDB.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="blog_news")
public class Blog_News {

	@Id
	private String id;
	
	private Date created_at;
	
	private String created_by;
	
	private Date update_at;
	
	private int updated_by;
	
	private int flg_delete;
	
	@ManyToOne
	@MapsId("language_id")
	@JoinColumn(name="language_id")
	private Language language;
	
	private String group_id;
	
	@ManyToOne
	@MapsId("category_id")
	@JoinColumn(name="category_id")
	private Blog_New_Category blog_new_category;
	
	private String seo_description;
	
	private String seo_title;
	
	private String seo_url;
	
	private String title;
	
	private String html_content;
	
	private Date show_date;
	
	private int status;
	
	private String author;
	
	private String image;
	
	private int hot;
	
	private String type;
}
