package org.emp.service;

import java.util.List;

import org.emp.model.EmloyeeModel;

public interface EmpServ {
	public boolean isAddNewEmployee(EmloyeeModel model);
	 public List<EmloyeeModel> getAllEmployees();
	 public boolean isDeleteEmployeeById(int eid);
	 public boolean isUpdateEmployee(EmloyeeModel model);
}
