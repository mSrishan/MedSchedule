package com.srishan.MedSchedule.repo;

import com.srishan.MedSchedule.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query("SELECT DISTINCT d.specialization FROM Doctor d")
    List<String> findDistinctSpecializations();

    @Query("SELECT d FROM Doctor d WHERE d.specialization LIKE %:specialization% AND d.id NOT IN " +
            "(SELECT a.doctor.id FROM Appointment a WHERE a.availableDate = :availableDate)")
    List<Doctor> findAvailableDoctorsByDatesAndSpecialization(LocalDate availableDate, String specialization);

    @Query("SELECT d FROM Doctor d WHERE d.id NOT IN (SELECT a.doctor.id FROM Appointment a)")
    List<Doctor> getAllAvailableDoctors();
}
