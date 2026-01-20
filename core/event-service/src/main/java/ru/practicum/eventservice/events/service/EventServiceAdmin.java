package ru.practicum.eventservice.events.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import ru.practicum.interaction.dto.event.EventFullDto;
import ru.practicum.interaction.dto.event.requests.EventAdminFilterRequest;
import ru.practicum.interaction.dto.event.requests.UpdateEventAdminRequest;

public interface EventServiceAdmin {
    List<EventFullDto> getEventsByParams(EventAdminFilterRequest filterCriteria, Pageable pageRequest);

    EventFullDto updateEventById(Long eventId, UpdateEventAdminRequest dto);
}