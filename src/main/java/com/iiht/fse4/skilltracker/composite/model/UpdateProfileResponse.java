package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class UpdateProfileResponse {

    boolean isUpdated = true;
    String message = "";
    HttpStatus status;
}
