package ru.practicum.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.practicum.model.action.Action;

public interface ActionRepository extends JpaRepository<Action, Long> {

    List<Long> findDistinctEventIdByUserIdAndEventIdIn(Long userId, Set<Long> otherEventIds);

    Optional<Action> findByUserIdAndEventId(Long userId, Long eventId);

    List<Action> findAllByEventIdIn(Set<Long> eventIds);

    @Query("select distinct a.eventId from Action a where a.userId = :userId order by a.timestamp desc")
    List<Long> findDistinctEventIdByUserIdOrderByTimestampDesc(Long userId, org.springframework.data.domain.Pageable pageable);
}
