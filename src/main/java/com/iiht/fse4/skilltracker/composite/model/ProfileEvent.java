package com.iiht.fse4.skilltracker.composite.model;

import lombok.*;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProfileEvent {
    private int profileEventId;
    private int profileId;
    private String profileEventType;
    private String profilePayload;
    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String createdDate;
    private String createdBy;
}
