package BlogAppJPA.demo.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "post")
public class PostEntity extends BaseDomainEntity {
    private String title;
    private String body;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id",referencedColumnName = "id",unique = true)
    private UserEntity user;
    @ManyToMany(mappedBy = "posts")
    private List<CategoryEntity> categories = new ArrayList<>();
}
