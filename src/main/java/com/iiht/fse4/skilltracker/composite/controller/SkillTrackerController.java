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

    @PostMapping("/add-profile")
    public ResponseEntity<AddProfileResponse> addProfile(@RequestBody Profile profile) {
        AddProfileResponse response = skillTrackerService.addProfile(profile);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @PostMapping("/update-profile")
    public ResponseEntity<UpdateProfileResponse> updateProfile(@RequestBody Profile profile) {
        UpdateProfileResponse response = skillTrackerService.updateProfile(profile);
        return new ResponseEntity<>(response, response.getStatus());
    }


    @RequestMapping(value = {"/get-profiles", "/get-profiles/{associateId}"}, method = RequestMethod.GET)
    public ResponseEntity<GetProfileResponse> getProfileList(@PathVariable(required = false) String associateId) {
        GetProfileResponse response = skillTrackerService.getProfiles(associateId);
        return new ResponseEntity<>(response, response.getStatus());
    }

    @GetMapping("/skills")
    public ResponseEntity<GetSkillsResponse> getSkills() {
        GetSkillsResponse response = skillTrackerService.getSkills();
        return new ResponseEntity<>(response, response.getStatus());
    }
}
