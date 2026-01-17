package ru.practicum.eventservice.events.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import ru.practicum.interaction.dto.event.EventFullDto;
import ru.practicum.interaction.dto.event.EventShortDto;
import ru.practicum.interaction.dto.event.requests.EventPublicFilterRequest;

public interface EventServicePublic {
    List<EventShortDto> getEventsByParams(EventPublicFilterRequest filterCriteria, Pageable pageRequest);

    EventFullDto getEventById(Long eventId);

    void recordHit(String uri, String ip);
}