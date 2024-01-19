package com.example.ReceptLabb.services;

import com.example.ReceptLabb.models.Recipe;
import com.example.ReceptLabb.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public String deleteRecipe(String id) {
        recipeRepository.deleteById(id);
        return "Recipe deleted";
    }

    public Recipe getRecipeById(String id) {
        return recipeRepository.findById(id).get();
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe updateRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }
}
