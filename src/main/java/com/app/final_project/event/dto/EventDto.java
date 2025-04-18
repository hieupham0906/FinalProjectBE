package com.app.final_project.event.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventDto {
    private int eventId;
    private int point;
    private int maxAttenders;
    private String eventName;
    private String location;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<String> imageUrls;
}
