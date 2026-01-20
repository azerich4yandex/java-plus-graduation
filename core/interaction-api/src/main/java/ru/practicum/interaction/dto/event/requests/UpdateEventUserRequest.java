package ru.practicum.interaction.dto.event.requests;

import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import ru.practicum.interaction.dto.event.enums.UpdateUserStateAction;
import ru.practicum.interaction.dto.event.validators.EventDateInTwoHours;

/**
 * Request DTO for event updates initiated by users.
 * <p></p>
 * Fields:
 * - `stateAction` – User-initiated state change:
 *   SEND_TO_REVIEW (submit for moderation), CANCEL_REVIEW (revert to draft).
 * - `eventDate` – New event date/time. Must be at least 2 hours in the future.
 * <p></p>
 * Inherits all updatable fields from {@link UpdateEventRequest}:
 * - annotation, category, description, location, paid, participantLimit,
 *   requestModeration, title.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UpdateEventUserRequest extends UpdateEventRequest {
    UpdateUserStateAction stateAction;

    @EventDateInTwoHours
    LocalDateTime eventDate;
}