package org.tsystems.notificationengine.utils;

public enum SubscriptionPlan {

	SILVER("SILVER"), GOLD("GOLD"), PLATINIUM("PLATINIUM");

	public String name;

	SubscriptionPlan(String name) {
		this.name = name;
	}
}
