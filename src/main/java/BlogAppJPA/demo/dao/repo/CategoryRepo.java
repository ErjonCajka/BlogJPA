package BlogAppJPA.demo.dao.repo;

import BlogAppJPA.demo.dao.IBaseDao;
import BlogAppJPA.demo.entity.CategoryEntity;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepo implements IBaseDao<CategoryEntity,Integer> {

    @Override
    public EntityManager entityManager() {
        return null;
    }

    @Override
    public CategoryEntity save(CategoryEntity entity) {
        return IBaseDao.super.save(entity);
    }

    @Override
    public Optional<CategoryEntity> findById(Class<CategoryEntity> entityClass, Integer id) {
        return IBaseDao.super.findById(entityClass, id);
    }

    @Override
    public void deleteById(Class<CategoryEntity> entityClass, Integer id) {
        IBaseDao.super.deleteById(entityClass, id);
    }

    @Override
    public List<CategoryEntity> findAll(Class<CategoryEntity> type) {
        return IBaseDao.super.findAll(type);
    }

    @Override
    public boolean existsById(Class<CategoryEntity> entityClass, Integer id) {
        return IBaseDao.super.existsById(entityClass, id);
    }
}
