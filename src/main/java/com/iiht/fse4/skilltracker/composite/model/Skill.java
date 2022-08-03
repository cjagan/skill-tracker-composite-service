package com.iiht.fse4.skilltracker.composite.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Skill {
    @JsonProperty
    private int skillId;
    @JsonProperty
    private String skillName;
    @JsonProperty
    private String skillType;
    @JsonProperty
    private LocalDateTime createdDate;
}
