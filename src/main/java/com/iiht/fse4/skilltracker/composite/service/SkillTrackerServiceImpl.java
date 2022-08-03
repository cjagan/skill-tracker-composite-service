package com.iiht.fse4.skilltracker.composite.service;

import com.iiht.fse4.skilltracker.composite.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SkillTrackerServiceImpl implements SkillTrackerService {


    /**
     * Get all the skills
     *
     * @return @{@link GetSkillsResponse} object which contains list of skills
     */
    @Override
    public GetSkillsResponse getSkills() {
        return null;
    }

    /**
     * Add profile
     *
     * @param profile @{@link Profile} object
     * @return @{@link AddProfileResponse} object
     */
    @Override
    public AddProfileResponse addProfile(Profile profile) {
        return null;
    }

    /**
     * @param profile
     * @return
     */
    @Override
    public UpdateProfileResponse updateProfile(Profile profile) {
        return null;
    }

    /**
     * Get Profile based on associate Id
     *
     * @param associateId associate Id
     * @return @{@link GetProfileResponse} object
     */
    @Override
    public GetProfileResponse getProfiles(String associateId) {
        return null;
    }

    /**
     * get Profile Skill for given profile Id
     *
     * @param profileId Profile Id
     * @return list of @{@link ProfileSkill} objects
     */
    private List<ProfileSkill> getProfileSkills(int profileId) {
        return null;
    }

    /**
     * Add profile skills to Profile
     *
     * @param profileId        Profile Id
     * @param profileSkillList list of @{@link ProfileSkill} objects
     */
    private void addProfileSkills(int profileId, List<ProfileSkill> profileSkillList) {

    }

    /**
     * Update Profile Skills for a given Profile.
     *
     * @param profileId        Profile Id
     * @param profileSkillList List of @{@link ProfileSkill} objects.
     */
    private void updateProfileSkills(int profileId, List<ProfileSkill> profileSkillList) {

    }



}
