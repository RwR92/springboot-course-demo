package com.example.springbootcoursedemo.service;

import com.example.springbootcoursedemo.entity.Category;
import com.example.springbootcoursedemo.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category findById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    public Category create(Category category) {
        return categoryRepository.save(category);
    }
}
