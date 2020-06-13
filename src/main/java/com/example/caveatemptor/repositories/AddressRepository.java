package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {
}
