package Mini_Web_Project2021.Mini_Web_Project.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long num;

    private String name;
    private DateTimeFormat date; //주문 날짜
    private String subject; //상품명
    private int total; //총 가격
    private int quantity; // 총 수량


}
