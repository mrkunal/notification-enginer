package org.tsystems.notificationengine.repositories;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;
import org.tsystems.notificationengine.domain.Notifications;

@Repository
public interface NotificationRepository extends MongoRepository<Notifications, ObjectId> {

}
