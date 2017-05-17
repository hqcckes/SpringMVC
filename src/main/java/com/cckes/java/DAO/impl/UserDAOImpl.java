package com.cckes.java.DAO.impl;

import com.cckes.java.DAO.UserDAO;
import com.cckes.java.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 *
 *
 * @author alvinyuan
 * @create 2017/5/8
 */
@Repository
public class UserDAOImpl implements UserDAO {

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int save(User u) {
        return (Integer) sessionFactory.getCurrentSession().save(u);
    }

    public List<User> findAll() {
        CriteriaBuilder cb = sessionFactory.getCurrentSession().getCriteriaBuilder();
        CriteriaQuery<User> cq = cb.createQuery(User.class);
        Root<User> r = cq.from(User.class);
        cq.select(r);
        return sessionFactory.getCurrentSession().createQuery(cq).getResultList();
    }
}
