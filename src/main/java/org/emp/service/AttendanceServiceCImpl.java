//package org.emp.service;
//
//import org.emp.model.Attendance;
//import org.emp.repository.AttendanceRepositoryC;
//
//public class AttendanceServiceCImpl implements AttendanceCService {
//    private AttendanceRepositoryC attendanceRepositoryC;
//
//    public AttendanceServiceCImpl(AttendanceRepositoryC attendanceRepository) {
//        this.attendanceRepositoryC = attendanceRepository;
//    }
//
//    @Override
//    public void saveAttendance(Attendance attendance) {
//        attendanceRepositoryC.saveAttendance(attendance);
//    }
//}

// AttendanceServiceCImpl.java
package org.emp.service;

import org.emp.model.Attendance;
import org.emp.repository.AttendanceRepositoryC;

public class AttendanceServiceCImpl implements AttendanceCService {
    private AttendanceRepositoryC attendanceRepositoryC;

    public AttendanceServiceCImpl(AttendanceRepositoryC attendanceRepositoryC) {
        this.attendanceRepositoryC = attendanceRepositoryC;
    }

    @Override
    public void saveAttendance(Attendance attendance) {
        attendanceRepositoryC.saveAttendance(attendance);
    }
}