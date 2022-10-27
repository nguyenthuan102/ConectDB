package com.example.ConectDB.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="permission")
public class Permission {

	@Id
	private String id;

	private Date created_at;

	private String created_by;

	private Date update_time;

	private int updated_by;

	private int flg_delete;

	private String name;

	private String slug;
}
