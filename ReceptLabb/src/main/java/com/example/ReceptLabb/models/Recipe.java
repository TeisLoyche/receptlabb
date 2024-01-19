package com.example.ReceptLabb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "receptboken")
public class Recipe {

    @Id
    public String id;

    public String title;

    public String[] ingredients;

    public String instructions;

    public String cookingTime;

    public Recipe() {
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getCookingTime() {
        return cookingTime;
    }
}
