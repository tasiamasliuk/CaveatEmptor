package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
