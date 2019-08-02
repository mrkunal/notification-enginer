package org.tsystems.notificationengine.service;

import org.tsystems.notificationengine.utils.NotificationCo;
import org.tsystems.notificationengine.utils.vo.NotificationVo;

public interface NotificationService {

	NotificationVo send(NotificationCo notificationCo);

}
