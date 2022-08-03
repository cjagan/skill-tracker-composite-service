package com.iiht.fse4.skilltracker.composite.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "command-service-client", url = "${skill-tracker.command.uri}")
@Slf4j
public class CommandServiceClient {
}
