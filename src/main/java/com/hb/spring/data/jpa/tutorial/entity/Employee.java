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
@Table(name = "tbl_employee")
public class Employee
{
    @Id
    private int employeeId;
    private String employeeName;
    private String about;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private Laptop laptop;  // refers to the 'employee' attribute in the Laptop entity class
                            // Foreign key 'employee_employee_id' will be created in the Laptop table
}
