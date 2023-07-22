//package com.example.gd.Entity;
//
//import io.swagger.v3.oas.annotations.Hidden;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.NoArgsConstructor;
//
//@Table
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//@EqualsAndHashCode(callSuper = true)
//public class Paycheck extends Documents{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id_Paycheck;
//
//    @Hidden
//    @ManyToOne
//    @JoinColumn(name = "id_employee", referencedColumnName = "id")
//    private Employee employee;
//
//
//    @Column
//    @NotBlank
//    private Double salary;
//
//    public Paycheck(Employee employee,Double salary){
//        this.employee = employee;
//        this.salary = salary;
//    }
//
//}
