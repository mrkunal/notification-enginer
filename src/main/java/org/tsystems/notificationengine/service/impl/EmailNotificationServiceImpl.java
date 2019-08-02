package org.tsystems.notificationengine.service.impl;

import org.springframework.stereotype.Service;
import org.tsystems.notificationengine.service.EmailNotificationService;
import org.tsystems.notificationengine.service.NotificationService;
import org.tsystems.notificationengine.utils.NotificationCo;
import org.tsystems.notificationengine.utils.vo.NotificationVo;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EmailNotificationServiceImpl implements EmailNotificationService {

	@Override
	public NotificationVo send(NotificationCo notificationCo) {

		
		
		log.info("Called From EmailService");
		
		return null;
	}

}
