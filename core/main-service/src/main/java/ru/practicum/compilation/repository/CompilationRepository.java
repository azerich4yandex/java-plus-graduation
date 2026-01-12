package ru.practicum.compilation.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.practicum.compilation.model.Compilation;

@Repository
public interface CompilationRepository extends JpaRepository<Compilation, Long> {

    @EntityGraph(attributePaths = {"events", "events.category", "events.initiator"})
    List<Compilation> findAllByPinnedIs(Boolean pinned, Pageable pageable);

    @EntityGraph(attributePaths = {"events", "events.category", "events.initiator"})
    Optional<Compilation> findCompilationById(Long id);


}