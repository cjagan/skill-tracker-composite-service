package com.iiht.fse4.skilltracker.composite.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iiht.fse4.skilltracker.composite.model.ProfileEvent;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class ServiceUtil {
/*    public static String convertToJson(Object object) {
        return new Gson().toJson(object);
    }*/

    public static ProfileEvent covertJsonToObject(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper()
               /* .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule())*/;
        //mapper.findAndRegisterModules();
        return mapper.readValue(json, ProfileEvent.class);
    }



    public static String dateTimeFormat(LocalDateTime dateTime) {
        Timestamp timestamp = Timestamp.valueOf(dateTime);
        DateFormat dateTimeFormat = new SimpleDateFormat(ServiceConstants.DATETIME_PATTERN);
        return dateTimeFormat.format(timestamp);
        //String formattedDateTimeStr = dateTimeFormat.format(timestamp);
        //return Timestamp.valueOf(formattedDateTimeStr);
    }

    public static int getRandomNumber() {
        return ThreadLocalRandom.current().nextInt(1, 999999);
    }

    public static void main(String[] args) {
        //dateTimeFormat(LocalDateTime.now());

        ProfileEvent profileEvent = ProfileEvent.builder()
                .profileEventId(1)
                .createdBy("Jagan")
                .profileEventType("ADD")
                .createdDate(String.valueOf(LocalDateTime.now()))
                .build();
        System.out.println(profileEvent.toString());
       // String convertedJson = convertToJson(profileEvent);
        //System.out.println(convertedJson);
    }
}
