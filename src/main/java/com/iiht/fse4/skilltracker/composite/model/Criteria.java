package com.iiht.fse4.skilltracker.composite.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Criteria {
    public String name;
    public String associateId;
    public String skillName;
}