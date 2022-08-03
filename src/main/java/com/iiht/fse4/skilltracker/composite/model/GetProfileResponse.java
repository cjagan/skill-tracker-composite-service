package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class GetProfileResponse {
    List<Profile> profileList = new ArrayList<>();
    String message = "";
    HttpStatus status;
}
