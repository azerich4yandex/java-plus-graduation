package ru.practicum.service;

import java.time.LocalDateTime;
import java.util.List;
import ru.practicum.dto.StatDto;
import ru.practicum.dto.ViewStats;

public interface StatsService {
    StatDto createHit(StatDto dto);

    List<ViewStats> getAllStats(LocalDateTime start, LocalDateTime end, List<String> uris, boolean unique);
}