package org.tsystems.notificationengine.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.tsystems.notificationengine.domain.Clients;

@Repository
public interface ClientRepository extends MongoRepository<Clients,ObjectId> {

}
