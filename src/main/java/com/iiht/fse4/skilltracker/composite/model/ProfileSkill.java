package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProfileSkill {
    private int profileSkillId;
    private int expertiseLevel;
    private String status;
    private Skill skill;
}
