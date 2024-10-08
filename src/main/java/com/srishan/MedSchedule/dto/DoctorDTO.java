package com.srishan.MedSchedule.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DoctorDTO {
    private Long id;
    private String name;
    private String specialization;
    private BigDecimal chargesPerOneConsultatent;
    private String doctorPhotoUrl;
    private List<AppointmentDTO> appointments;
}
