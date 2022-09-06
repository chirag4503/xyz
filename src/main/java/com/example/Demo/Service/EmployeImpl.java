package com.example.Demo.Service;



	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import org.springframework.transaction.annotation.Transactional;

	import com.example.Demo.Entity.*;
	import com.example.Demo.Repository.*;

	@Component
	public class EmployeImpl implements EmployeInterface {

		@Autowired
		private EmployeRepository employeRepository;

			
			@Override
			@Transactional
			public void deleteData(int id) {
				employeRepository.deleteById(id);
				
			}
			@Override
			public List<EmployeEntity> ShowDetails() {
				// TODO Auto-generated method stub
				return employeRepository.findAll();
			}
			@Override
			public EmployeEntity addEmploye(EmployeEntity emp) {
				// TODO Auto-generated method stub
				 EmployeEntity data = employeRepository.save(emp);
				return data;
			}
			@Override
			public EmployeEntity updateData(int id, EmployeEntity emp) {
				// TODO Auto-generated method stub
				return null;
			}
			@Override
			public EmployeEntity findEmp(int id) {
				// TODO Auto-generated method stub
				return employeRepository.findById(id);
			}

	}



