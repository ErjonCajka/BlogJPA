package BlogAppJPA.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseDomainEntity{
    private String emri;
    @ManyToMany
    @JoinTable( name = "category_post",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "post_id")
    )
    private List<PostEntity> posts = new ArrayList<>();

}
