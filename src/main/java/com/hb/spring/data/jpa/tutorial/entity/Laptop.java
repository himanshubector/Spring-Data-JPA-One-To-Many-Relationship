package com.hb.spring.data.jpa.tutorial.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tbl_laptop")
public class Laptop
{
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;   // This means Foreign key will be created only in the Laptop table
}

