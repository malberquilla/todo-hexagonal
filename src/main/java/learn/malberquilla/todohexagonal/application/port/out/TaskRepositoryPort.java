package learn.malberquilla.todohexagonal.application.port.out;

import learn.malberquilla.todohexagonal.domain.model.Task;

public interface TaskRepositoryPort {

    Task save(Task task);
}
