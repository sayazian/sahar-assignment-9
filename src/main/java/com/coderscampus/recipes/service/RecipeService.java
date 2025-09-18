package com.coderscampus.recipes.service;

import com.coderscampus.recipes.domain.Recipe;
import com.coderscampus.recipes.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getRecipes() {
        return recipeRepository.getRecipes();
    }

    public List<Recipe> getGlutenFree() {
        return getRecipes().stream().filter(Recipe::getGlutenFree).collect(Collectors.toList());
    }

    public List<Recipe> getVegan() {
        return getRecipes().stream().filter(Recipe::getVegan).collect(Collectors.toList());
    }

    public List<Recipe> getVegetarian() {
        return getRecipes().stream().filter(Recipe::getVegetarian).collect(Collectors.toList());
    }

    public List<Recipe> getVeganAndGlutenFree() {
        return getRecipes().stream().filter(recipe -> recipe.getGlutenFree() && recipe.getVegan()).collect(Collectors.toList());
    }
}
