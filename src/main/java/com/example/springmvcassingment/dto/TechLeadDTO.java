package com.example.springmvcassingment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*@Data*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechLeadDTO {
    String id;
    String name;
    String group;
    double salary;


}
