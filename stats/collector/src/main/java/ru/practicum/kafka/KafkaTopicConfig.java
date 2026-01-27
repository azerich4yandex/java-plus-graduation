package ru.practicum.kafka;

import java.util.EnumMap;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("collector.kafka")
public class KafkaTopicConfig {
    EnumMap<KafkaTopic, String> topics = new EnumMap<>(KafkaTopic.class);
}
