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
@Table
@AllArgsConstructor
@NoArgsConstructor
public class User_Role {

	@Id
	private String id;

	private Date created_at;

	private String created_by;

	private Date update_at;

	private int updated_by;

	private int flg_delete;

	@ManyToOne
	@MapsId("user_id")
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@MapsId("role_id")
	@JoinColumn(name="role_id")
	private Role role;
	
}
