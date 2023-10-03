package BlogAppJPA.demo.dao;

import BlogAppJPA.demo.entity.BaseDomainEntity;
import jakarta.persistence.EntityManager;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface IBaseDao <T extends BaseDomainEntity,I extends Serializable> {
     abstract EntityManager entityManager();


    default public T save(T entity){

        return entityManager().merge(entity);
    }

    default public Optional<T> findById(Class<T> entityClass, I id){
        return Optional.of(entityManager().find(entityClass,id));
    }
    default public void deleteById(Class<T> entityClass,I id) {
        findById(entityClass,id).ifPresentOrElse(e-> entityManager().remove(e),
                ()-> new RuntimeException("Entity with given id not found"));
    }

    default public List<T> findAll(Class<T> type ) {
        var query = entityManager().getCriteriaBuilder().createQuery(type);
        var root = query.from(type);
        query.select(root);
        return entityManager().createQuery(query).getResultList();
    }
    default public boolean existsById(Class<T> entityClass,I id) {
        var entity = findById(entityClass,id);
        return entity!=null?true:false;
    }

}
