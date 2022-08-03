package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;

@Data
@Builder
public class GetSkillsResponse {
    private List<Skill> skillList;
    HttpStatus status;
    String message;
}
