package BlogAppJPA.demo.dao.repo;

import BlogAppJPA.demo.dao.IBaseDao;
import BlogAppJPA.demo.entity.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@Transactional
public class UserRepo implements IBaseDao<UserEntity,Integer> {
 @PersistenceContext
   private EntityManager entityManager;

    @Override
    public EntityManager entityManager() {
        return entityManager;
    }



    @Override

    public UserEntity save(UserEntity entity) {
        return IBaseDao.super.save(entity);
    }

    @Override

    public Optional<UserEntity> findById(Class<UserEntity> entityClass, Integer id) {
        return IBaseDao.super.findById(entityClass, id);
    }

    @Override

    public void deleteById(Class<UserEntity> entityClass, Integer id) {
        IBaseDao.super.deleteById(entityClass, id);
    }

    @Override

    public List<UserEntity> findAll(Class<UserEntity> type) {
        return IBaseDao.super.findAll(type);
    }

    @Override

    public boolean existsById(Class<UserEntity> entityClass, Integer id) {
        return IBaseDao.super.existsById(entityClass, id);
    }
}
