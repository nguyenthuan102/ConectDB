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
@Table(name="contact")
public class Contact {

	@Id
	private String id;

	private Date created_at;

	private String created_by;

	private Date update_at;

	private int updated_by;

	private int flg_delete;

	private String name;

	private String type;

	private String email;

	private String mobile;

	private int status;

	private String note;

	private String file_url;

	private String address;

	private String profile_url;

	private String contact_purpose;

	private String title;
}
