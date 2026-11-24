package learn.malberquilla.todohexagonal.domain.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
public class Task {
    @EqualsAndHashCode.Include
    private String id;

    private String title;
    private String description;
    private TaskStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    public void complete() {
        this.status = TaskStatus.COMPLETED;
        this.completedAt = LocalDateTime.now();
    }

    public void reopen() {
        this.status = TaskStatus.PENDING;
        this.completedAt = null;
    }

    public void initialize() {
        this.status = TaskStatus.PENDING;
        this.createdAt = LocalDateTime.now();
    }
}
