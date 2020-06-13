package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long> {
}
