package com.iiht.fse4.skilltracker.composite.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProfileSkill {
    private int expertiseLevel;
    private String skillName;
    private String skillType;
}

