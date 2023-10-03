package BlogAppJPA.demo;

import BlogAppJPA.demo.dao.IBaseDao;
import BlogAppJPA.demo.entity.UserEntity;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

public class BlogApplicationJPA implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplicationJPA.class, args);
	}
	@Autowired
	IBaseDao<UserEntity,Integer> iBaseDao;
	@Override
	public void run(String... args) throws Exception {
		UserEntity entity = new UserEntity("Erjon Cajka");
		iBaseDao.save(entity);
	}


}
