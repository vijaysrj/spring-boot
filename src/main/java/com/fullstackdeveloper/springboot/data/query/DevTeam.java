package com.fullstackdeveloper.springboot.data.query;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEV_TEAM")
public class DevTeam {
	
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name="name")
	private String name;
	
	
	@Column(name="experience")
	private String experience;
	
	@Column(name="technology")
	private String technology;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "DevTeam [id=" + id + ", name=" + name + ", experience=" + experience + ", technology=" + technology
				+ "]";
	}
	
	

}
