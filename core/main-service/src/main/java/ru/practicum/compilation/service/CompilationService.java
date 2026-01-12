package ru.practicum.compilation.service;

import java.util.List;
import ru.practicum.compilation.dto.CompilationDtoRequest;
import ru.practicum.compilation.dto.CompilationDtoResponse;
import ru.practicum.compilation.dto.CompilationDtoUpdate;

public interface CompilationService {
    CompilationDtoResponse createCompilationAdmin(CompilationDtoRequest compilationDtoRequest);

    CompilationDtoResponse updateCompilationAdmin(CompilationDtoUpdate compilationDtoRequest, Long compId);

    void deleteCompilationAdmin(Long compId);

    CompilationDtoResponse getCompilationByIdPublic(Long compId);

    List<CompilationDtoResponse> getAllCompilationsPublic(Boolean pinned, Integer from, Integer size);
}