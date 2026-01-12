package ru.practicum.requests.service;

import java.util.List;
import ru.practicum.requests.dto.ParticipationRequestDto;
import ru.practicum.requests.dto.RequestUpdateDto;
import ru.practicum.requests.dto.RequestUpdateResultDto;

public interface RequestService {

    List<ParticipationRequestDto> getUserRequests(Long userId);

    ParticipationRequestDto createRequest(Long userId, Long eventId);

    ParticipationRequestDto cancelRequest(Long userId, Long requestId);

    List<ParticipationRequestDto> getEventRequests(Long userId, Long eventId);

    RequestUpdateResultDto updateEventRequests(Long userId, Long eventId, RequestUpdateDto updateDto);
}
