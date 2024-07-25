package com.avazhenin.demo.dto;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class PaymentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long amount;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private EmployeeDTO employee;
    private Date paymentDate;
}
