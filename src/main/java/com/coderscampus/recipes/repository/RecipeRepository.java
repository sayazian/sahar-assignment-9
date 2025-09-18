package com.coderscampus.recipes.repository;

import com.coderscampus.recipes.domain.Recipe;
import com.coderscampus.recipes.service.FileService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RecipeRepository {

    private final FileService fileService;

    public RecipeRepository(FileService fileService) {
        this.fileService = fileService;
    }
    private List<Recipe> recipes;

    @PostConstruct
    private void loadRecipes() {
        this.recipes = fileService.parseRecipes("recipes.txt");
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }
}
