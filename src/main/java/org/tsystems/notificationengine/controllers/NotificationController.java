package org.tsystems.notificationengine.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsystems.notificationengine.service.NotificationService;
import org.tsystems.notificationengine.utils.NotificationCo;

@RestController
@RequestMapping("/notification")
public class NotificationController {

	private NotificationService notificationService;

	@PostMapping(value = "/send")
	ResponseEntity<String> sendNotification(@RequestBody NotificationCo notificationCo) {
		
		notificationService.send(notificationCo);
		return ResponseEntity.ok().body("Success");
	}

}
