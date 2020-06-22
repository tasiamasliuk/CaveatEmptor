package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.Category;
import com.example.caveatemptor.models.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface ItemRepository extends CrudRepository<Item,Long> {
    Item findByidItem(Long id);
    Set<Item> findBycategory(Category category);
}
