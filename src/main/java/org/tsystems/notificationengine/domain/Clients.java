package org.tsystems.notificationengine.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.tsystems.notificationengine.utils.SubscriptionPlan;

import lombok.Data;

@Data
@Document(collection = "clients")
public class Clients {

	@Id
	public ObjectId id;

	@Field("clientId")
	private String clientId;

	@Field("clientName")
	private String clientName;

	@Field("subscriptionPlan")
	private SubscriptionPlan subscriptionPlan;

	@Field("password")
	private String password;

}
