package org.tsystems.notificationengine.utils;

import java.util.List;

import lombok.Data;

@Data
public class NotificationCo {

	private String message;

	private List<String> receivers;
	
	private NotificationType notificationType;
	
	private String senderNumber;

	private String subject;
	
}
