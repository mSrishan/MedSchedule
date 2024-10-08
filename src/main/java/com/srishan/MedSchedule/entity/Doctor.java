package com.srishan.MedSchedule.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String name;

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", chargesPerOneConsultatent=" + chargesPerOneConsultatent +
                ", doctorPhotoUrl='" + doctorPhotoUrl + '\'' +
                '}';
    }

    private String specialization;
    private BigDecimal chargesPerOneConsultatent;
    private String doctorPhotoUrl;
    @OneToMany
    private List<Appoinment> appoinments = new ArrayList<>();
}
