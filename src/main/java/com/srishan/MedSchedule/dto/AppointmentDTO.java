package com.srishan.MedSchedule.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.srishan.MedSchedule.entity.Doctor;
import com.srishan.MedSchedule.entity.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppointmentDTO {

    private  Long id;
    private LocalDate availableDate;
    private  String appointmentConformationCode;
    private UserDTO user;
    private DoctorDTO doctor;

}
