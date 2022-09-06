package com.example.Demo.Service;

	import java.util.*;
	import com.example.Demo.Entity.*;

	public interface EmployeInterface {
		public List<EmployeEntity>ShowDetails();
		public EmployeEntity addEmploye(EmployeEntity emp);
		public EmployeEntity updateData(int id, EmployeEntity emp);
		public EmployeEntity findEmp(int id);
		public void deleteData(int id);

	}





