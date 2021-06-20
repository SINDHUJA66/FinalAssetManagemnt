package com.asset.management.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

    @Entity
	@Table(name="users_profile")
	public class Users  implements Serializable {
		
		@Id
		@GenericGenerator(name = "user_auto", strategy = "increment")
		@GeneratedValue(generator ="user_auto")
		
		@Column(name="user_id")
		private long  id;
		
		@Column(name="role")
		private String role;
		
		@Column(name="firstname")
		private String firstname;
		
		@Column(name="lastname")
		private String lastname;
		
		@Column(name="email")
		private String email;
		
		@Column(name="password")
		private String password;

		public long getId() {
			return id;
		}

		public String getRole() {
			return role;
		}

		public String getFirstname() {
			return firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public String getEmail() {
			return email;
		}

		public String getPassword() {
			return password;
		}

		public void setId(long id) {
			this.id = id;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Users [id=" + id + ", role=" + role + ", firstname=" + firstname + ", lastname=" + lastname
					+ ", email=" + email + ", password=" + password + "]";
		}
		
		
	}
		

		
		