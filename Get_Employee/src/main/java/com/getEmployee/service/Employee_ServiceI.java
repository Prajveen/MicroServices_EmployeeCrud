package com.getEmployee.service;

import java.util.Optional;

import com.getEmployee.entity.EmployeeDetails;
import com.getEmployee.globalException.Id_NotFound_Exception;

public interface Employee_ServiceI {

	Optional<EmployeeDetails> getEmployeeDetails(Integer empId) throws Id_NotFound_Exception;

}

