package vn.its.gsmultipledatasources.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import vn.its.gsmultipledatasources.config.Constants;
import vn.its.gsmultipledatasources.entity1.Publisher;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PublisherDAO {

    @Autowired
    @PersistenceContext(unitName = Constants.JPA_UNIT_NAME_1)
    private EntityManager entityManager;

    public List<Publisher> listPublishers() {
        String sql = "Select e from " + Publisher.class.getName() + " e ";
        Query query = entityManager.createQuery(sql, Publisher.class);
        return query.getResultList();
    }

    public Publisher findById(Long id) {
        return this.entityManager.find(Publisher.class, id);
    }

}