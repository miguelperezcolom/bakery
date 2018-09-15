package miguel.model;

import io.mateu.mdd.core.model.authentication.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity@Getter@Setter
public class LogEntry {

    @Id@GeneratedValue
    private long id;

    @ManyToOne@NotNull
    private User owner;

    @NotNull
    private LocalDateTime when = LocalDateTime.now();

    @NotEmpty
    private String text;

}
