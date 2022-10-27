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
@Table(name="role_permission")
@AllArgsConstructor
@NoArgsConstructor
public class Role_Permission {

	@Id
	private String id;
	
	private Date created_at;
	
	private String created_by;
	
	private Date update_at;
	
	private int updated_by;
	
	private int flg_delete;

	@ManyToOne
	@MapsId("role_id")
	@JoinColumn(name="role_id")
	private Role role;
	
	@ManyToOne
	@MapsId("permission_id")
	@JoinColumn(name="permission_id")
	private Permission permission;
}
