package com.eventmanagement.bo;

import com.eventmanagement.enums.EventProcessType;

import lombok.Data;

public @Data class Event {
	
	private long id;
	private String name;
	private String shortName;
	private EventProcessType eventProcessType;
	private long coordinatorId;

}
