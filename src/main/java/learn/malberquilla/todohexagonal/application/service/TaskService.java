package learn.malberquilla.todohexagonal.application.service;

import org.springframework.stereotype.Service;

import learn.malberquilla.todohexagonal.application.port.in.CreateTaskUseCase;
import learn.malberquilla.todohexagonal.application.port.out.TaskRepositoryPort;
import learn.malberquilla.todohexagonal.domain.model.Task;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService implements CreateTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
