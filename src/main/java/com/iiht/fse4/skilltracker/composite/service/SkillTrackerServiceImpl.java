package com.iiht.fse4.skilltracker.composite.service;

import com.iiht.fse4.skilltracker.composite.client.CommandServiceClient;
import com.iiht.fse4.skilltracker.composite.client.QueryServiceClient;
import com.iiht.fse4.skilltracker.composite.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SkillTrackerServiceImpl implements SkillTrackerService {

    @Autowired
    private QueryServiceClient queryServiceClient;

    @Autowired
    private CommandServiceClient commandServiceClient;

    /**
     * Get all the skills
     *
     * @return @{@link GetSkillsResponse} object which contains list of skills
     */
    @Override
    public GetSkillsResponse getSkills() {
        return queryServiceClient.getSkills();
    }

    /**
     * Add User profile
     *
     * @param profile @{@link Profile} object
     * @return @{@link AddProfileResponse} object
     */
    @Override
    public AddProfileResponse addProfile(Profile profile) {
        return commandServiceClient.addProfile(profile);
    }

    /**
     * @param profile
     * @return
     */
    @Override
    public UpdateProfileResponse updateProfile(Profile profile) {
        return commandServiceClient.updateProfile(profile);
    }

    /**
     * Get Profiles by criteria
     *
     * @param criteria
     * @param criteriaValue
     * @return @{@link GetProfileResponse object}
     */
    @Override
    public GetProfileResponse getProfiles(String criteria, String criteriaValue) {
        return queryServiceClient.getProfileList(criteria, criteriaValue);
    }

}
