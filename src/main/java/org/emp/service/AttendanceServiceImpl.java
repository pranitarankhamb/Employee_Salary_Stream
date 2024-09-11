package org.emp.service;

import java.util.List;


import org.emp.model.AttendacneModel;
import org.emp.repository.AttendaceRepositoryImpl;
import org.emp.repository.AttendanceRepository;

public class AttendanceServiceImpl implements AttendanceService {
	
	AttendanceRepository attentRepo = new AttendaceRepositoryImpl();

	@Override
	public boolean ismarkAttendanceEmployee(AttendacneModel attendaceModel) {
		return attentRepo.ismarkAttendanceEmployee(attendaceModel);
	}

	@Override
	public List<AttendacneModel> getAllAttendanceModel() {
		return attentRepo.getAllAttendanceModel();
	}
	
	

}
