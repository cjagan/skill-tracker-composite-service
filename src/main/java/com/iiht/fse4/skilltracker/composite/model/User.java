package com.iiht.fse4.skilltracker.composite.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private int userId;
    private String userName;
    private String password;
    private String emailId;
    private String userRole;
}
