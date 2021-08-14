package Mini_Web_Project2021.Mini_Web_Project.repository;

import Mini_Web_Project2021.Mini_Web_Project.domain.Item;
import Mini_Web_Project2021.Mini_Web_Project.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@RequiredArgsConstructor
public class ItemRepository {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public String register(Item item){
        em.persist(item);
        return item.getName();
    }

    public Item find(String name) {
        return em.find(Item.class, name);
    }
}
