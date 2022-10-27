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
@Table(name="field")
public class Feild {

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

	private String feild_name;

	private String sort_field_name;

	private String define_field;

	private String why_choose;

	private String solution;

	private String step_active;

	private String achievement;

	private String solution_tech;

	private String deployment_price;

	private String identification_solution;

	private String image;

	private String banner_image;

	private String seo_url;

	private String seo_title;

	private String seo_description;

	private int status;

	private String logo;
}
