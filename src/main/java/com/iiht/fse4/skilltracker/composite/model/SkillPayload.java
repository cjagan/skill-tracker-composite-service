package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class SkillPayload {

    private long profileId;
    private String associateId;
    private List<Skill> skillList;
}
