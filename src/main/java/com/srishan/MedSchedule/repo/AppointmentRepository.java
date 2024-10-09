package com.srishan.MedSchedule.repo;

import com.srishan.MedSchedule.entity.Appointment;
import com.srishan.MedSchedule.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByAppoinmentConformationCode(String appoinmentConformationCode);
    List<Appointment> findByUserId(Long userId);
}
