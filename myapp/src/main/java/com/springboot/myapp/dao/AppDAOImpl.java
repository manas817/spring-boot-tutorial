package com.springboot.myapp.dao;

import com.springboot.myapp.entity.Instructor;
import com.springboot.myapp.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAOImpl implements AppDAO {
    private EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor instructor) {
        entityManager.persist(instructor);
    }

    @Override
    public Instructor findInstructorById(int id) {
        return entityManager.find(Instructor.class, id);
    }

    @Override
    @Transactional
    public void deleteByInstructorId(int id) {
        Instructor theInstructor = entityManager.find(Instructor.class, id);
        entityManager.remove(theInstructor);
    }

    @Override
    public InstructorDetail findInstructorDetailById(int id) {
        return entityManager.find(InstructorDetail.class, id);
    }

    @Override
    @Transactional
    public void deleteInstructorDetailById(int id) {
        InstructorDetail theInstructorDetail = entityManager.find(InstructorDetail.class, id);

        // remove the associated object reference
        // break bi - directional link
        theInstructorDetail.getInstructor().setInstructorDetail(null);
        entityManager.remove(theInstructorDetail);
    }
}
