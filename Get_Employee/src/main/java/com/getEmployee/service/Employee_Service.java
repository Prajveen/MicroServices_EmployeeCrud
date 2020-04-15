package com.getEmployee.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getEmployee.dao.EmployeeRepository;
import com.getEmployee.entity.EmployeeDetails;
import com.getEmployee.globalException.Id_NotFound_Exception;
@Service
@Transactional
public class Employee_Service implements Employee_ServiceI{

	@Autowired
	private EmployeeRepository dao;
	

	@Override
	public Optional<EmployeeDetails> getEmployeeDetails(Integer empId) throws Id_NotFound_Exception {
		return dao.findById(empId);

	}

}
