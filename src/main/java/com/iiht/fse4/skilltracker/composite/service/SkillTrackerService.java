package com.iiht.fse4.skilltracker.composite.service;

import com.iiht.fse4.skilltracker.composite.model.*;

public interface SkillTrackerService {

    GetSkillsResponse getSkills();

    AddProfileResponse addProfile(Profile profile);

    UpdateProfileResponse updateProfile(Profile profile);

    GetProfileResponse getProfiles(String criteria, String criteriaValue);

    GetProfileResponse getProfiles(Criteria criteria);
}
