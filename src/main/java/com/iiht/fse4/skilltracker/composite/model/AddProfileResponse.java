package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class AddProfileResponse {

    boolean isAdded;
    String message = "";
    HttpStatus status;
}
