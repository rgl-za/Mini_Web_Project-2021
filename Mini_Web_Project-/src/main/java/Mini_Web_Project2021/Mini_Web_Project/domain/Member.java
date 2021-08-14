package Mini_Web_Project2021.Mini_Web_Project.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String nick_name;

    @OneToMany(mappedBy = "member")
    private List<Order> members = new ArrayList<Order>();
}
