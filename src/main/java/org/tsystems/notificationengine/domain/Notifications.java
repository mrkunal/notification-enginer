package org.tsystems.notificationengine.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.tsystems.notificationengine.utils.SubscriptionPlan;

import lombok.Data;

@Data
@Document(collection="notifications")
public class Notifications {

	@Id
	public ObjectId id;
	

	public String clientId;
	
	
	

}
