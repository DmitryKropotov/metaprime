package com.project.model;

import lombok.Data;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.*;

@Entity
@Data
@Table(name="employee")
public class Employee {
    @Id
    int id;
    int employer_id;
    String name;
}
