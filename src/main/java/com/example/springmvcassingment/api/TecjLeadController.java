package com.example.springmvcassingment.api;

import com.example.springmvcassingment.dto.TechLeadDTO;
import com.example.springmvcassingment.service.TechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/techlead")
public class TecjLeadController {
    @Autowired
    TechService techService;
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    TechLeadDTO saveTeachLead(
            @RequestPart String id,
            @RequestPart String name,
            @RequestPart String group){
        TechLeadDTO leadDTO=new TechLeadDTO();
        leadDTO.setId(id);
        leadDTO.setName(name);
        leadDTO.setGroup(group);
        return techService.saveTech(leadDTO);
    }


}
