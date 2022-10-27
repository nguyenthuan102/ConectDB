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
@Table(name = "about_us")

public class About_Us {

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

	private String author;

	private String name;

	private Date date_of_incorporation;

	private String legal_representative;

	private int amout_people;

	private double capital;

	private String address;

	private String bank;

	private String field;

	private int project;

	private int expert;

	private int partner;

	private String field_content;

	private String project_content;

	private String blog_news_content;

	private String vision_content;

	private String quotes;

	private String mission_content;

	private String achievements_content;

	private String achievements;

	private String client_content;

	private String clients;

	private String image;
}
