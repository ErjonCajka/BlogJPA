package BlogAppJPA.demo.dao.repo;

import BlogAppJPA.demo.dao.IBaseDao;
import BlogAppJPA.demo.entity.PostEntity;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository

public class PostRepo implements IBaseDao<PostEntity,Integer> {
    @Override
    public EntityManager entityManager() {
        return null;
    }

    @Override
    public PostEntity save(PostEntity entity) {
        return IBaseDao.super.save(entity);
    }

    @Override
    public Optional<PostEntity> findById(Class<PostEntity> entityClass, Integer id) {
        return IBaseDao.super.findById(entityClass, id);
    }

    @Override
    public void deleteById(Class<PostEntity> entityClass, Integer id) {
        IBaseDao.super.deleteById(entityClass, id);
    }

    @Override
    public List<PostEntity> findAll(Class<PostEntity> type) {
        return IBaseDao.super.findAll(type);
    }

    @Override
    public boolean existsById(Class<PostEntity> entityClass, Integer id) {
        return IBaseDao.super.existsById(entityClass, id);
    }
}
