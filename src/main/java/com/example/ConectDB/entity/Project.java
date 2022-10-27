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
@Table(name="project")
public class Project {
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

	private String name;

	private String seo_url;

	private String url;

	private String scale;

	private String platform;

	private String logo;

	private String background_image;

	private int priority;

	private String description_html;

	private String list_image;
}
