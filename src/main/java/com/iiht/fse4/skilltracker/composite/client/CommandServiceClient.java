package com.iiht.fse4.skilltracker.composite.client;

import com.iiht.fse4.skilltracker.composite.config.FeignClientConfig;
import com.iiht.fse4.skilltracker.composite.hystrix.CommandServiceFallBack;
import com.iiht.fse4.skilltracker.composite.model.AddProfileResponse;
import com.iiht.fse4.skilltracker.composite.model.Profile;
import com.iiht.fse4.skilltracker.composite.model.UpdateProfileResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "command-service-client",
        url = "${command.uri}",
        configuration = FeignClientConfig.class,
        fallback = CommandServiceFallBack.class)
public interface CommandServiceClient {

    @PostMapping("/add-profile")
    @Headers("Content-Type: application/json")
    AddProfileResponse addProfile(@RequestBody Profile profile);

    @PostMapping("/update-profile")
    @Headers("Content-Type: application/json")
    UpdateProfileResponse updateProfile(@RequestBody Profile profile);


}
