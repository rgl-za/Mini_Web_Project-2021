package Mini_Web_Project2021.Mini_Web_Project.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long num;
    private String name; //상품명
    private int price; //가격
    private int quantity; //수량

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order orderId;
}
