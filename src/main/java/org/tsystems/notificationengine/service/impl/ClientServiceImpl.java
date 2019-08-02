package org.tsystems.notificationengine.service.impl;

import org.springframework.stereotype.Service;
import org.tsystems.notificationengine.repositories.ClientRepository;
import org.tsystems.notificationengine.service.NotificationService;
import org.tsystems.notificationengine.utils.NotificationCo;
import org.tsystems.notificationengine.utils.NotificationType;

@Service
public class ClientServiceImpl {

	private ClientRepository clientRepository;

	private EmailNotificationServiceImpl emailNotificationServiceImpl;

	private NotificationService notificationService;

	
	public ClientServiceImpl(ClientRepository clientRepository,
			EmailNotificationServiceImpl emailNotificationServiceImpl) {
		super();
		this.clientRepository = clientRepository;
		this.emailNotificationServiceImpl = emailNotificationServiceImpl;
	}

	public void send(NotificationCo notificationCo) {

		if (notificationCo.getNotificationType().equals(NotificationType.EMAIL)) {
//			notificationService.send(notificationCo);
		}

	}
	
	
	

}
