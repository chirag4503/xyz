package com.example.Demo.Entity;



	import javax.persistence.Entity;

	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class EmployeEntity {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;
		private String Name;
		private int age;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id =id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age =age;
		}
		public EmployeEntity() {
			super();
		}
		public EmployeEntity(int id, String name, int age) {
			super();
			this.id = id;
			Name =name;
			this.age = age;
		}

	}






