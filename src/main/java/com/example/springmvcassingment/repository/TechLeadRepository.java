package com.example.springmvcassingment.repository;

import com.example.springmvcassingment.dto.TechLeadDTO;
import com.example.springmvcassingment.entity.TechLeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechLeadRepository extends JpaRepository<TechLeadEntity,String> {
    TechLeadEntity save(TechLeadDTO techLeadDTO);
    TechLeadEntity findTechLeadEntityById(String id);
    void  deleteById(String id);
}
