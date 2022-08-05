package com.iiht.fse4.skilltracker.composite.hystrix;

import com.iiht.fse4.skilltracker.composite.client.CommandServiceClient;
import com.iiht.fse4.skilltracker.composite.model.AddProfileResponse;
import com.iiht.fse4.skilltracker.composite.model.Profile;
import com.iiht.fse4.skilltracker.composite.model.UpdateProfileResponse;
import org.springframework.stereotype.Component;

@Component
public class CommandServiceFallBack implements CommandServiceClient {
    @Override
    public AddProfileResponse addProfile(Profile profile) {
        return AddProfileResponse.builder().build();
    }

    @Override
    public UpdateProfileResponse updateProfile(Profile profile) {
        return UpdateProfileResponse.builder().build();
    }
}
