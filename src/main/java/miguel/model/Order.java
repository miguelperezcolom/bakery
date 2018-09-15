package miguel.model;

import io.mateu.mdd.core.annotations.Output;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity@Getter@Setter
@Table(name = "_order")
public class Order {

    @Id@GeneratedValue
    private long id;


    private LocalDateTime due = LocalDateTime.now();

    @NotNull
    private OrderOrigin origin = OrderOrigin.Bakery;

    private String name, telephone, details;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderLine> lines = new ArrayList<>();

    @NotNull
    private OrderStatus status = OrderStatus.New;

    @OneToMany(cascade = CascadeType.ALL)
    @Output
    private List<LogEntry> log;

}
