package com.iiht.fse4.skilltracker.composite.client;

import com.iiht.fse4.skilltracker.composite.config.FeignClientConfig;
import com.iiht.fse4.skilltracker.composite.hystrix.QueryServiceFallBack;
import com.iiht.fse4.skilltracker.composite.model.GetProfileResponse;
import com.iiht.fse4.skilltracker.composite.model.GetSkillsResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "query-service-client",
        url = "${query.uri}",
        configuration = FeignClientConfig.class,
        fallback = QueryServiceFallBack.class)

public interface QueryServiceClient {

    @GetMapping("/skills")
    @Headers("Content-Type: application/json")
    GetSkillsResponse getSkills();

    @GetMapping("{criteria}/{criteriaValue}")
    @Headers("Content-Type: application/json")
    GetProfileResponse getProfileList(@PathVariable String criteria, @PathVariable String criteriaValue);

    @GetMapping("{associateId}")
    @Headers("Content-Type: application/json")
    GetProfileResponse getProfile(@PathVariable String associateId);
}
