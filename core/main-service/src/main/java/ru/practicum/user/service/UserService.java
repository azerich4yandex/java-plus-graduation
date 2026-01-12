package ru.practicum.user.service;

import java.util.List;
import ru.practicum.user.dto.NewUserRequest;
import ru.practicum.user.dto.UserDto;

public interface UserService {
    List<UserDto> getUsers(List<Long> ids, Integer from, Integer size);

    UserDto create(NewUserRequest newUser);

    void delete(Long id);
}