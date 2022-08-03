package com.iiht.fse4.skilltracker.composite.util;

public interface ServiceConstants {

    String SKILL_TRACKER_API = "skill-tracker-command/";
    String ENGINEER_API = SKILL_TRACKER_API + "/engineer";
    String ADMIN_API = SKILL_TRACKER_API + "/admin";
    String PREFIX_CTS = "CTS";

    String MSG_SUCCESS = "SUCCESS";
    String MSG_FAILURE = "FAILURE";

    String YES = "Y";
    String NO = "N";

    String TOPIC = "skill-tracker-events";
    String DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
}
