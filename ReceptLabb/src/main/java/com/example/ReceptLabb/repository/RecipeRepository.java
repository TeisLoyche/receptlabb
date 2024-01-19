package com.example.ReceptLabb.repository;

import com.example.ReceptLabb.models.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipe, String> {

}
