package org.emp.repository;

import java.util.List;

import org.emp.model.AttendacneModel;

public interface AttendanceRepository {
	public boolean ismarkAttendanceEmployee(AttendacneModel attendaceModel);
	public List<AttendacneModel> getAllAttendanceModel();
}
