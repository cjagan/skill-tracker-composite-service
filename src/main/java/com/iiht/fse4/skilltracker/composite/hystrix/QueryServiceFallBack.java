package com.iiht.fse4.skilltracker.composite.hystrix;

import com.iiht.fse4.skilltracker.composite.client.QueryServiceClient;
import com.iiht.fse4.skilltracker.composite.model.GetProfileResponse;
import com.iiht.fse4.skilltracker.composite.model.GetSkillsResponse;
import org.springframework.stereotype.Component;

@Component
public class QueryServiceFallBack implements QueryServiceClient {

    @Override
    public GetSkillsResponse getSkills() {
        return GetSkillsResponse.builder().build();
    }

    @Override
    public GetProfileResponse getProfileList(String criteria, String criteriaValue) {
        return GetProfileResponse.builder()
                .build();
    }

    @Override
    public GetProfileResponse getProfile(String associateId) {
        return GetProfileResponse.builder()
                .build();
    }
}
