# Explore With Me - Дипломный проект

## Краткое описание
Дипломная версия сервиса афиши мероприятий, переработанная для современных облачных сред. Основные улучшения: переход на микросервисную архитектуру, внедрение рекомендательной системы и интеграция потоковой обработки данных.

## Архитектура
### Инфраструктурные сервисы (`infra` модуль)
- **[Eureka Server](infra/discovery-server/pom.xml)** - сервис обнаружения и регистрации микросервисов
- **[API Gateway](infra/gateway-server/pom.xml)** - единая точка входа с маршрутизацией запросов
- **[Config Server](infra/config-server/pom.xml)** - централизованное управление конфигурациями

### Бизнес-сервисы (`core` модуль)
- **[Event Service](core/event-service/pom.xml)** - управление мероприятиями
- **[Interaction API](core/interaction-api/pom.xml)** - общие DTO, Feign-клиенты, обработчики исключений, константы
- **[Request Service](core/request-service/pom.xml)** - управление заявками на участие
- **[Subscription Service](core/subscription-service/pom.xml)** - управление подписками на пользователей
- **[User Service](core/user-service/pom.xml)** - управление пользователями

### Система статистики (`stats` модуль)
- **[Stats Client](stats/stats-client/pom.xml)** - обеспечение взаимодействия с сервисами модуля `core`
- **[Stats DTO](stats/stats-dto/pom.xml)** - общие DTO
- **[Stats Server](stats/stats-server/pom.xml)** - обеспечение сбора статистики

### Спецификации
- [Спецификация основного сервиса](ewm-main-service-spec.json)
- [Спецификация сервиса статистики](ewm-stats-service-spec.json)

---
*Проект выполнен в рамках дипломной работы по курсу Java-разработки*