package ru.homework.tasktracker.strategy.impl;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.homework.tasktracker.service.TaskService;

@ExtendWith(MockitoExtension.class)
class TaskDeleteStrategyTest {

    @Mock
    TaskService taskService;

    @InjectMocks
    TaskDeleteStrategy taskDeleteStrategy;

//    @Test
//    @DisplayName("Удаление задачи с нормальными входными данными")
//    void execute_successTest() {
//        TaskEvent event = new TaskEvent("task delete 1");
//        StrategyResponse strategyResponse = taskDeleteStrategy.execute(event);
//        assertEquals("Задача успешно удалена!", strategyResponse.getMessage());
//        assertEquals(Status.OK, strategyResponse.getStatus());
//    }
//
//    @Test
//    @DisplayName("Удаление задачи без указания в команде id задачи")
//    void execute_WhenTaskIdIsNull_ThenReturnBadResponse() {
//        TaskEvent event = new TaskEvent("task delete");
//        StrategyResponse strategyResponse = taskDeleteStrategy.execute(event);
//        assertEquals("Для удаления задачи после команды надо ввести его id", strategyResponse.getMessage());
//        assertEquals(Status.BAD, strategyResponse.getStatus());
//    }
//
//    @Test
//    @DisplayName("Удаление задачи с указанием нечислового id задачи")
//    void execute_WhenTaskIdIsNotValid_ThenReturnBadResponse() {
//        TaskEvent event = new TaskEvent("task delete dfssdfsd");
//        StrategyResponse strategyResponse = taskDeleteStrategy.execute(event);
//        assertEquals("id должен быть числовым значением", strategyResponse.getMessage());
//        assertEquals(Status.BAD, strategyResponse.getStatus());
//    }
}