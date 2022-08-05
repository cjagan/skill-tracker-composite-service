package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class Profile {
    private int profileId;
    private int userId;
    private String associateId;
    private String name;
    private long mobile;
    private String email;
    private List<ProfileSkill> profileSkillList;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}
