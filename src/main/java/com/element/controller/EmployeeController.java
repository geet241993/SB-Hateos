package com.element.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.element.bind.Employee;
@RestController
public class EmployeeController {
	@GetMapping(value="/emp",produces={"application/json"})
	public Employee getEmployee(@RequestParam Integer empId) {
		Employee employee=new Employee(101,"Akash","Satara",40000);
		return employee;
	}
	@GetMapping(value="/emps",produces={"application/json"})
	public List<Employee> getAllEmployee() {
		Employee employee1=new Employee(202,"Akash","Satara",40000);
		Employee employee2=new Employee(203,"Pratima","Pune",45000);
		Employee employee3=new Employee(204,"Suvarna","KOlhapur",30000);
		Employee employee4=new Employee(205,"Mahesh","Mumbai",25000);
		Employee employee5=new Employee(206,"Suyog","Pune",36000);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		return list;
}
}