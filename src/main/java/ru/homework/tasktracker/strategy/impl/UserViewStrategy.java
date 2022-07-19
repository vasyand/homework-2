package ru.homework.tasktracker.strategy.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.homework.tasktracker.model.StrategyResponse;
import ru.homework.tasktracker.model.UserStrategyName;
import ru.homework.tasktracker.model.entity.User;
import ru.homework.tasktracker.model.event.UserEvent;
import ru.homework.tasktracker.model.event.UserViewEvent;
import ru.homework.tasktracker.service.UserService;
import ru.homework.tasktracker.strategy.UserStrategy;

import java.util.List;

import static ru.homework.tasktracker.mapper.UserEventMapper.toUserViewEvent;
import static ru.homework.tasktracker.util.MessageHelper.createMessageFromEntity;
import static ru.homework.tasktracker.util.MessageHelper.createMessageFromListOfEntities;

@Component
@RequiredArgsConstructor
public class UserViewStrategy implements UserStrategy {
    private final UserService userService;

    @Override
    public StrategyResponse execute(UserEvent event) {
        StrategyResponse strategyResponse = new StrategyResponse();
        UserViewEvent userViewEvent = toUserViewEvent(event);
        if (userViewEvent.getUserId() == null) {
            List<User> users = userService.findAll();
            strategyResponse.setMessage(createMessageFromListOfEntities(
                    "Список всех пользователей: \n",
                    "В бд вообще нет пользователей",
                    users));
        } else {
            User user = userService.findById(userViewEvent.getUserId());
            strategyResponse.setMessage(createMessageFromEntity(user));
        }
        return strategyResponse;
    }

    @Override
    public UserStrategyName getStrategyName() {
        return UserStrategyName.VIEW;
    }
}
