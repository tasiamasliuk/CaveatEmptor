package com.example.caveatemptor.repositories;

import com.example.caveatemptor.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Category findBynameCategory(String nameCategory);
}
