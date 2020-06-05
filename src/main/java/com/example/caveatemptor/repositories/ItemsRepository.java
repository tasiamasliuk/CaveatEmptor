package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.Items;
import org.springframework.data.repository.CrudRepository;

public interface ItemsRepository extends CrudRepository<Items,Long> {
}
