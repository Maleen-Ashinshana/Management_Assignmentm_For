package com.example.springmvcassingment.converter;

import com.example.springmvcassingment.dto.TechLeadDTO;
import com.example.springmvcassingment.entity.TechLeadEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    private  final ModelMapper modelMapper;

    public Converter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public TechLeadEntity getTechEntity(TechLeadDTO techLeadDTO){
        return modelMapper.map(techLeadDTO,TechLeadEntity.class);
    }
    public  TechLeadDTO getTechDTO(TechLeadEntity techLeadEntity){
        return modelMapper.map(techLeadEntity,TechLeadDTO.class);
    }
}
