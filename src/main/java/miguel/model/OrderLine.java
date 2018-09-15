package miguel.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity@Getter@Setter
public class OrderLine {

    @Id@GeneratedValue
    private long id;


    @ManyToOne@NotNull
    private Order order;

    @ManyToOne
    private Product product;

    private int quantity;

    private String details;

}
