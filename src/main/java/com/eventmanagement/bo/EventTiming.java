package com.eventmanagement.bo;

import java.time.LocalDate;
import java.time.LocalTime;

import com.eventmanagement.enums.EventType;

import lombok.Data;

public @Data class EventTiming {
	
	private long id;
	private long eventId;
	private LocalDate startDate;
	private LocalDate endDate;
	private LocalTime eventTime;
	private String location;
	private EventType eventType;
}
