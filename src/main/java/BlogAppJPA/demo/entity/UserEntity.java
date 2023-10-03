package BlogAppJPA.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "user")
public class UserEntity extends BaseDomainEntity {
    private String emri;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<PostEntity> postEntity;

    public UserEntity(String emri){
        this.emri = emri;
    }

    public UserEntity() {

    }
}
