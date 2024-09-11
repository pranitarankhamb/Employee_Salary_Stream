package org.emp.model;

import java.sql.Date;

public class EmloyeeModel {
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Date getJoin_date() {
			return join_date;
		}
		public void setJoin_date(Date join_date) {
			this.join_date = join_date;
		}
		public int getPrimary_contact() {
			return primary_contact;
		}
		public void setPrimary_contact(int primary_contact) {
			this.primary_contact = primary_contact;
		}
		public int getSecondary_contact() {
			return secondary_contact;
		}
		public void setSecondary_contact(int i) {
			this.secondary_contact = i;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Date getBirth_date() {
			return birth_date;
		}
		public void setBirth_date(Date birth_date) {
			this.birth_date = birth_date;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		private String name;
		private String department;
		private Date join_date;
		private int primary_contact;
		private int secondary_contact;
		private String email;
		private Date birth_date;
		private String gender;
		private String address;
				
		
}
