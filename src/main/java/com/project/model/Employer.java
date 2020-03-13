package com.project.model;

import lombok.Data;
import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

import javax.persistence.Id;

@Entity
@Data
@Table(name="employer")
public class Employer {
    @Id
    int id;
    String name;
}
