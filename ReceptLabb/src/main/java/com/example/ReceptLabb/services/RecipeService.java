package com.example.ReceptLabb.services;

import com.example.ReceptLabb.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ReceptLabb.models.Recipe;
import com.example.ReceptLabb.repository.RecipeRepository;
import com.example.ReceptLabb.models.Recipe;
import com.example.ReceptLabb.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
