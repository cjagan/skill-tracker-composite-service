package com.iiht.fse4.skilltracker.composite.util;

import com.iiht.fse4.skilltracker.composite.model.*;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnitTestUtil {

    public static GetProfileResponse getProfileResponseByAssociateId() {
        return GetProfileResponse.builder()
                .profileList(Arrays.asList(getProfile1()))
                .status(HttpStatus.OK)
                .message(ServiceConstants.MSG_SUCCESS)
                .build();

    }

    public static GetProfileResponse getProfileResponse() {
        return GetProfileResponse.builder()
                .profileList(getProfileList())
                .status(HttpStatus.OK)
                .message(ServiceConstants.MSG_SUCCESS)
                .build();
    }


    public static Profile buildAddProfileRequest() {
        return Profile.builder()
                .associateId("CTS100")
                .name("Suresh")
                .mobile(9898989898l)
                .email("suresh@cts.com")
                .profileSkillList(addProfileSkillList())
                //.createdDate(LocalDateTime.now())
                .build();
    }

    public static Profile buildUpdateProfileRequest() {
        return Profile.builder()
                .profileId(3)
                .associateId("CTS3")
                .name("Suresh")
                .mobile(9898989898l)
                .email("suresh@cts.com")
                .profileSkillList(null)
                //.createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build();
    }

    public static AddProfileResponse addProfileResponse() {
        return AddProfileResponse.builder()
                .isAdded(true)
                .status(HttpStatus.OK)
                .message(ServiceConstants.MSG_SUCCESS)
                .build();
    }

    public static UpdateProfileResponse updateProfileResponse() {
        return UpdateProfileResponse.builder()
                .isUpdated(true)
                .status(HttpStatus.OK)
                .message(ServiceConstants.MSG_SUCCESS)
                .build();
    }

    private static List<Profile> getProfileList() {
        List<Profile> profileList = new ArrayList<>();
        profileList.add(getProfile1());
        profileList.add(getProfile2());
        return profileList;
    }

    private static Profile getProfile1() {
        return Profile.builder()
                .profileId(1)
                .associateId("CTS1")
                .name("Suresh")
                .mobile(9898989898l)
                .email("suresh@cts.com")
                .profileSkillList(getProfileSkillList())
                .createdDate(LocalDateTime.now())
                .build();
    }

    private static Profile getProfile2() {
        return Profile.builder()
                .profileId(2)
                .associateId("CTS2")
                .name("Harish")
                .mobile(9898989899l)
                .email("harish@cts.com")
                .profileSkillList(getProfileSkillList())
                .createdDate(LocalDateTime.now())
                .build();
    }

    private static List<ProfileSkill> getProfileSkillList() {
        List<ProfileSkill> profileSkillList = new ArrayList<>();
        ProfileSkill profileSkill = ProfileSkill.builder()
                .profileSkillId(11)
                .status(ServiceConstants.YES)
                .expertiseLevel(10)
                .skill(Skill.builder()
                        .skillId(111)
                        .skillName("Angular")
                        .skillType("Technical")
                        .createdDate(LocalDateTime.now())
                        .build())
                .build();
        profileSkillList.add(profileSkill);

        ProfileSkill profileSkill1 = ProfileSkill.builder()
                .profileSkillId(12)
                .status(ServiceConstants.YES)
                .expertiseLevel(10)
                .skill(Skill.builder()
                        .skillId(112)
                        .skillName("SpringBoot")
                        .skillType("Technical")
                        .createdDate(LocalDateTime.now())
                        .build())
                .build();
        profileSkillList.add(profileSkill1);

        return profileSkillList;
    }


    private static List<ProfileSkill> addProfileSkillList() {
        List<ProfileSkill> profileSkillList = new ArrayList<>();
        ProfileSkill profileSkill = ProfileSkill.builder()
                .status(ServiceConstants.YES)
                .expertiseLevel(10)
                .skill(Skill.builder()
                        .skillId(111)
                        .skillName("Angular")
                        .skillType("Technical")
                        //.createdDate(LocalDateTime.now())
                        .build())
                .build();
        profileSkillList.add(profileSkill);

        ProfileSkill profileSkill1 = ProfileSkill.builder()
                .status(ServiceConstants.YES)
                .expertiseLevel(10)
                .skill(Skill.builder()
                        .skillId(112)
                        .skillName("SpringBoot")
                        .skillType("Technical")
                        //.createdDate(LocalDateTime.now())
                        .build())
                .build();
        profileSkillList.add(profileSkill1);

        return profileSkillList;
    }
}
