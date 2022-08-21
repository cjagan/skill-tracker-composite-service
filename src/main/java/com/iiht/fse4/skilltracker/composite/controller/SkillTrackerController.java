package com.iiht.fse4.skilltracker.composite.controller;

import com.iiht.fse4.skilltracker.composite.model.*;
import com.iiht.fse4.skilltracker.composite.service.SkillTrackerService;
import com.iiht.fse4.skilltracker.composite.util.ServiceConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(ServiceConstants.SKILL_TRACKER_API)
public class SkillTrackerController {

    @Autowired
    private SkillTrackerService skillTrackerService;

    @PostMapping(ServiceConstants.ENGINEER_API + "/add-profile")
    public ResponseEntity<AddProfileResponse> addProfile(@RequestBody Profile profile) {
        AddProfileResponse response = skillTrackerService.addProfile(profile);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping(ServiceConstants.ENGINEER_API + "/update-profile")
    public ResponseEntity<UpdateProfileResponse> updateProfile(@RequestBody Profile profile) {
        UpdateProfileResponse response = skillTrackerService.updateProfile(profile);
        return new ResponseEntity<>(response, response.getStatus());
    }


    @GetMapping(value = {ServiceConstants.ADMIN_API + "/{criteria}/{criteriaValue}",
            "/get-profiles/{criteria}/{criteriaValue}"})
    public ResponseEntity<GetProfileResponse> getProfileList(@PathVariable(required = true) String criteria,
                                                             @PathVariable(required = true) String criteriaValue) {
        GetProfileResponse response = skillTrackerService.getProfiles(criteria, criteriaValue);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping(ServiceConstants.ADMIN_API + "/criteria")
    public ResponseEntity<GetProfileResponse> getProfileList(@RequestBody Criteria criteria) {
        GetProfileResponse response = skillTrackerService.getProfiles(criteria);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping(value = {ServiceConstants.ENGINEER_API + "/get-profile/{associateId}"})
    public ResponseEntity<GetProfileResponse> getProfile(@PathVariable(required = true) String associateId) {
        GetProfileResponse response = skillTrackerService.getProfiles(ServiceConstants.PARAM_ASSOCIATE_ID, associateId);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/skills")
    public ResponseEntity<GetSkillsResponse> getSkills() {
        GetSkillsResponse response = skillTrackerService.getSkills();
        return new ResponseEntity<>(response, response.getStatus());
    }
}
