package ru.practicum.subscriptions.service;

import java.util.List;
import ru.practicum.subscriptions.dto.SubscriptionDto;

public interface SubscriptionService {
    SubscriptionDto subscribe(Long subscriberId, Long subscribedToId);

    void unsubscribe(Long subscriberId, Long subscribedToId);

    List<SubscriptionDto> getSubscriptions(Long userId);

    List<SubscriptionDto> getSubscribers(Long userId);
}
