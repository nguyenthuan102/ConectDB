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
@Table(name = "project_hook_tag")
@AllArgsConstructor
@NoArgsConstructor
public class Project_Hook_Tag {

	@Id
	private String id;

	private Date created_at;

	private String created_by;

	private Date update_at;

	private int updated_by;

	private int flg_delete;

	private String tag_id;

	private String project_id;

	@ManyToOne
	@MapsId("role_id")
	@JoinColumn(name = "role_id")
	private Project project;

	@ManyToOne
	@MapsId("permission_id")
	@JoinColumn(name = "permission_id")
	private Project_Tag project_tag;

}
