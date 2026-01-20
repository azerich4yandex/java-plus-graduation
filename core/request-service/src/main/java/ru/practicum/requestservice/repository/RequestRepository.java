package ru.practicum.requestservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.practicum.interaction.dto.request.enums.RequestStatus;
import ru.practicum.requestservice.model.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {
    List<Request> findAllByRequesterId(long userId);

    List<Request> findAllByEventId(long eventId);

    List<Request> findAllByIdInAndEventIdIs(List<Long> eventIds, long eventId);

    long countAllByEventIdAndStatusIs(long eventId, RequestStatus status);

    boolean existsByRequesterIdAndEventId(Long requesterId, Long eventId);
}
