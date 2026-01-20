package ru.practicum.client;

import java.time.LocalDateTime;
import java.util.List;
import ru.practicum.dto.HitDto;
import ru.practicum.dto.StatsDto;

public interface StatRestClient {
    void addHit(HitDto hitDto);

    List<StatsDto> getStats(LocalDateTime start, LocalDateTime end, List<String> uris, Boolean unique);
}