package ru.practicum.subscriptionservice.service;

import java.util.Set;
import org.springframework.data.domain.Pageable;
import ru.practicum.interaction.dto.subscription.SubscriptionDto;
import ru.practicum.interaction.dto.user.UserShortDto;

public interface SubscriptionService {
    SubscriptionDto subscribe(Long subscriberId, Long subscribedToId);

    void unsubscribe(Long subscriberId, Long subscribedToId);

    Set<UserShortDto> getSubscriptions(Long userId, Pageable page);
}
