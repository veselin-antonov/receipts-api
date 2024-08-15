package com.homeapp.receipts.model.repositories;

import com.homeapp.receipts.model.entities.Purchase;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchasesRepository extends MongoRepository<Purchase, ObjectId> {
	// TODO Reimplement product details page
	//List<Purchase> findAllByProductId(String productId);
}