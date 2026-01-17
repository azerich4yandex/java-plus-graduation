package ru.practicum.eventservice.compilation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import ru.practicum.eventservice.events.model.Event;

/**
 * Entity representing a compilation of events.
 *
 * Fields:
 * - `id` – Unique identifier of the compilation. Auto-generated.
 * - `pinned` – Indicates whether the compilation is pinned for highlighting.
 * - `title` – Title of the compilation. Limited to 50 characters.
 * - `events` – Set of events included in the compilation. Cascade delete enabled via join table `compilations_events`.
 */
@Getter
@Setter
@Entity
@ToString
@Table(name = "compilations")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Compilation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "pinned", nullable = false)
    Boolean pinned;

    @Column(name = "title", nullable = false)
    String title;

    @Fetch(FetchMode.SUBSELECT)
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "compilations_events",
            joinColumns = @JoinColumn(name = "compilation_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id"))
    Set<Event> events = new HashSet<>();
}