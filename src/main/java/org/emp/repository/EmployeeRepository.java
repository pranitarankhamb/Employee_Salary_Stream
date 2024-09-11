package org.emp.repository;
import java.util.List;

import org.emp.model.*;

public interface EmployeeRepository {

	public boolean isAddNewEmployee(EmloyeeModel model);
	public List<EmloyeeModel> getAllEmployees();
	public boolean isDeleteEmployeeById(int eid);
	public boolean isUpdateEmployee(EmloyeeModel model);
}



