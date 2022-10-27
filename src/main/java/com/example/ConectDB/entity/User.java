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
@Table(name = "user")
public class User {

	@Id
	private String id;

	private Date created_id;

	private String created_by;

	private Date update_at;

	private int updated_by;

	private int flg_delete;

	private String avatar;

	private String user_name;

	private String user_password;

	private String name;

	private String is_active;

	private String phone_number;

	private String email;

	private String gender;

}
