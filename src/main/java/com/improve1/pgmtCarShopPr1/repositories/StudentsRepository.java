package com.improve1.pgmtCarShopPr1.repositories;

import com.improve1.pgmtCarShopPr1.models.Sproduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

//@Repository
public interface StudentsRepository extends CrudRepository<Sproduct, Integer> {

}