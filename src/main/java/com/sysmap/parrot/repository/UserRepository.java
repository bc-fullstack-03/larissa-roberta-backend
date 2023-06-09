package com.sysmap.parrot.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sysmap.parrot.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, UUID> {
	User findUserByEmail(String userEmail);

	List<User> findAllByIdNotIn(List<UUID> exceptionIds);
}
