package learn.malberquilla.todohexagonal.application.port.in;

import learn.malberquilla.todohexagonal.domain.model.Task;

public interface CreateTaskUseCase {

    Task createTask(Task task);
}
