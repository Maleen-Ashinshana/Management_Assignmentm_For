package com.example.springmvcassingment.service.util;

import com.example.springmvcassingment.converter.Converter;
import com.example.springmvcassingment.dto.TechLeadDTO;
import com.example.springmvcassingment.entity.TechLeadEntity;
import com.example.springmvcassingment.repository.TechLeadRepository;
import com.example.springmvcassingment.service.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class TechServiceIMPL implements TechService {
    @Autowired
    TechLeadRepository repository;
    @Autowired
    Converter converter;
    @Override
    public TechLeadDTO saveTech(TechLeadDTO techLeadDTO) {
        techLeadDTO.setId(UUID.randomUUID().toString());
        TechLeadEntity techLead=converter.getTechEntity(techLeadDTO);
        repository.save(techLead);
        return techLeadDTO;
    }
}
