package org.emp.service;

import java.util.List;

import org.emp.model.AttendacneModel;

public interface AttendanceService {
	public boolean ismarkAttendanceEmployee(AttendacneModel attendaceModel);
	public List<AttendacneModel> getAllAttendanceModel();
}
