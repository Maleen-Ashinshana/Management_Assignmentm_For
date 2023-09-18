package com.example.springmvcassingment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "techLead")
public class TechLeadEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String group;
    @Column(nullable = false)
    double salary;
    @OneToMany(mappedBy = "id",cascade = CascadeType.ALL)
    private List<projectEntity> projectEntityList;
}
