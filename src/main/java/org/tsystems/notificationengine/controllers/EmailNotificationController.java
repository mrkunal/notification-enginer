package org.tsystems.notificationengine.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsystems.notificationengine.service.EmailNotificationService;
import org.tsystems.notificationengine.service.NotificationService;
import org.tsystems.notificationengine.utils.EmailNotificationCo;
import org.tsystems.notificationengine.utils.NotificationCo;
import org.tsystems.notificationengine.utils.vo.NotificationVo;

@RestController
@RequestMapping("/notification/email")
public class EmailNotificationController {

	private NotificationService notificationService;
	
	/**
	 * @param notificationService
	 */
	public EmailNotificationController(EmailNotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}

	@PostMapping(value = "/send")
	ResponseEntity<NotificationVo> sendNotification(@RequestBody EmailNotificationCo emailNotificationCo) {
		
		NotificationVo notificationVo= notificationService.send(emailNotificationCo);
		return ResponseEntity.ok().body(notificationVo);
	}

}
