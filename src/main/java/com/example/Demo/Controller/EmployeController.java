package com.example.Demo.Controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	import com.example.Demo.Entity.*;
	import com.example.Demo.Service.*;

	import java.util.List;

	@RequestMapping("/empl")
	@RestController
	public class EmployeController {
		
		@Autowired
		private EmployeImpl employeeImpl;
		
		@GetMapping("/")
		public String get() {
			return"Hey Welcome";
		}
		@GetMapping("/data")
		public List<EmployeEntity>getData(){
			System.out.println("Server is up");
			return employeeImpl.ShowDetails();
		}
		
		@GetMapping("/data/{id}")
		public EmployeEntity getOneEmp(@PathVariable("id")int id) {
			System.out.println("Server is up");
			return employeeImpl.findEmp(id);
		}
		@PostMapping("/data")
		public EmployeEntity postData(@RequestBody EmployeEntity emp) {
			return employeeImpl.addEmploye(emp);
			
		}
		@PutMapping("/data/{id}")
		public EmployeEntity putData(@RequestBody EmployeEntity emp,@PathVariable("id")int id) {
			return employeeImpl.updateData(id,emp);
		}
		@DeleteMapping("/data/{id}")
		public void deleteEmploye(@PathVariable("id")int id) {
			this.employeeImpl.deleteData(id);

		
		}

	}






