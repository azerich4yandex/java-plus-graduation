package ru.practicum.service;

import java.util.List;
import ru.practicum.dto.HitDto;
import ru.practicum.dto.StatsCriteriaDto;
import ru.practicum.dto.StatsDto;

public interface StatService {
    void addHit(HitDto hitDto);

    List<StatsDto> getStats(StatsCriteriaDto params);
}
