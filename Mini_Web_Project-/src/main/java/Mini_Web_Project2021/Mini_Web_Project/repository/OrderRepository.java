package Mini_Web_Project2021.Mini_Web_Project.repository;

import Mini_Web_Project2021.Mini_Web_Project.domain.Member;
import Mini_Web_Project2021.Mini_Web_Project.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Long join(Order order){
        em.persist(order);
        return order.getId();
    }

    public Order find(Long id){
        return em.find(Order.class, id);
    }
}
