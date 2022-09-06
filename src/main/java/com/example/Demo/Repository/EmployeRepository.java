package com.example.Demo.Repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.data.jpa.repository.Query;

	import com.example.Demo.Entity.*;

	public interface EmployeRepository extends JpaRepository<EmployeEntity, Integer>{
		public EmployeEntity findById(int id);


	}


