package com.srishan.MedSchedule.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private  int statusCode;
    private String message;
    private  String token;

    private String role;
    private  String expirationTime;
    private String appointmentConformationCode;

    private  UserDTO user;
    private DoctorDTO doctor;
    private AppointmentDTO appointment;

    private List<UserDTO> userList;
    private List<DoctorDTO> doctorList;
    private List<AppointmentDTO> appointmentList;



}
