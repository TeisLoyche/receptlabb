package com.example.ReceptLabb.controllers;

import com.example.ReceptLabb.models.Recipe;
import com.example.ReceptLabb.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/api")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    // POST nytt recept
    @PostMapping("/recipes")
    public Recipe createRecipe(@RequestBody Recipe recipe) {
        return recipeService.createRecipe(recipe);
    }
    // DELETE a recipe based on ID
    @RequestMapping(value = "/recipes/{id}", method = RequestMethod.DELETE)
    public String deleteRecipe(@PathVariable String id) {
        return recipeService.deleteRecipe(id);
    }
    // GET recipe by ID.
    @RequestMapping(value = "/recipes/{id}", method = RequestMethod.GET)
    public Recipe getRecipeById(@PathVariable String id) {
        return recipeService.getRecipeById(id); }

    // GET ALL recipes
    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    // UPDATE recipe.
    @PutMapping("/recipes")
    public Recipe updateRecipe(@RequestBody Recipe recipe) {
        return recipeService.updateRecipe(recipe);
    }
}
