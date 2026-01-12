package ru.practicum.category.service;

import java.util.List;
import ru.practicum.category.dto.CategoryDto;
import ru.practicum.category.dto.CategoryDtoNew;

public interface CategoryService {
    CategoryDto createCategoryAdmin(CategoryDtoNew newCategoryDto);

    CategoryDto updateCategoryAdmin(CategoryDtoNew newCategoryDto, Long catId);

    void deleteCategoryAdmin(Long catId);

    CategoryDto getByIDCategoryPublic(Long catId);

    List<CategoryDto> getAllCategoriesPublic(Integer from, Integer size);
}