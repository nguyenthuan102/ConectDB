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
@Table(name="blog_new_hook_tag")
public class Blog_New_Hook_Tag {

	@Id
	private String id;

	private Date created_at;

	private String created_by;

	private Date update_at;

	private int updated_by;

	private int flg_delete;

	@ManyToOne
	@MapsId("tag_id")
	@JoinColumn(name="tag_id")
	private Blog_New_Tag blog_new_tag;

	@ManyToOne
	@MapsId("blog_news_id")
	@JoinColumn(name="blog_news_id")
	private Blog_News blog_new;
}
