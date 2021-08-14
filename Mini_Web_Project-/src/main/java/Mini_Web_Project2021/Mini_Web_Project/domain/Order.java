package Mini_Web_Project2021.Mini_Web_Project.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDER_TABLE")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")

    private Long id;
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date; //주문 날짜

    private String subject; //상품명
    private int total; //총 가격
    private int quantity; // 총 수량

    @ManyToMany(mappedBy = "member_id")
    private List<Member> members = new ArrayList<Member>();

    @OneToMany(mappedBy = "item_id")//item
    private List<Item> items = new ArrayList<Item>();

}