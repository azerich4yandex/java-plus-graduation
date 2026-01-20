package ru.practicum.interaction.dto.event.compilation;

import jakarta.validation.constraints.Size;
import java.util.Set;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/**
 * DTO for updating an existing compilation.
 * <p></p>
 * Fields:
 * - `events` – Updated list of event IDs for the compilation. Defaults to empty.
 * - `pinned` – Updated pinned status of the compilation.
 * - `title` – Updated title of the compilation.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CompilationDtoUpdate {
    Set<Long> events;

    boolean pinned;

    @Size(min = 1, max = 50)
    String title;
}
