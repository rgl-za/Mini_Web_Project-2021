package Mini_Web_Project2021.Mini_Web_Project.repository;


import Mini_Web_Project2021.Mini_Web_Project.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    @PersistenceContext
    private EntityManager em;

    public String register(Order order){
        em.persist(order);
        return order.getName();
    }

    public Order find(String id){
        return em.find(Order.class, id);
    }
    //Order order = em.find(Order.class, );
    //List<Order> orders = em.createQuery("select o from order o");
}
