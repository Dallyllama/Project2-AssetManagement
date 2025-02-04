package com.revature.pms.bean;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="Users")
	public class Users {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "userid")
		private Integer id;
		@Column(name="username")
		private String name;
	
		
	
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
	}
	

