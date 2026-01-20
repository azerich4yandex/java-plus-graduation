package ru.practicum.eventservice.category.service;

import java.util.List;
import ru.practicum.interaction.dto.event.category.CategoryDto;

public interface CategoryServicePublic {
    CategoryDto getByIDCategoryPublic(Long catId);

    List<CategoryDto> getAllCategoriesPublic(Integer from, Integer size);
}
