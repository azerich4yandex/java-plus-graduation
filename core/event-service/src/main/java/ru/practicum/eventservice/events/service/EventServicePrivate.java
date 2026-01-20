package ru.practicum.eventservice.events.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import ru.practicum.interaction.dto.event.EventFullDto;
import ru.practicum.interaction.dto.event.EventShortDto;
import ru.practicum.interaction.dto.event.NewEventDto;
import ru.practicum.interaction.dto.event.requests.UpdateEventUserRequest;

public interface EventServicePrivate {
    EventFullDto getEvent(Long userId, Long eventId);

    EventFullDto addEvent(Long userId, NewEventDto newEventDto);

    List<EventShortDto> getEvents(Long userId, Pageable pageRequest);

    EventFullDto updateEvent(Long userId, Long eventId, UpdateEventUserRequest updateRequest);
}