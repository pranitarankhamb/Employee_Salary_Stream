package org.emp.service;
import java.util.List;

import org.emp.model.EmloyeeModel;
import org.emp.repository.*;

public class EmployeeServiceImpl implements EmpServ {

	EmployeeRepository empRepo = new EmployeeRepositoryImpl();
	@Override
	public boolean isAddNewEmployee(EmloyeeModel model) {
		
		return empRepo.isAddNewEmployee(model);
	}
	@Override
	public List<EmloyeeModel> getAllEmployees() {
		return empRepo.getAllEmployees();
	}
	@Override
	public boolean isDeleteEmployeeById(int eid) {
		return empRepo.isDeleteEmployeeById(eid);
	}
	@Override
	public boolean isUpdateEmployee(EmloyeeModel model) {
		return empRepo.isUpdateEmployee(model);
	}
}