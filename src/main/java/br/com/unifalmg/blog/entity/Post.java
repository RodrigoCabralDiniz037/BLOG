package br.com.unifalmg.blog.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "db2022108037", name = "post")
public class Post implements Serializable {

    @Id
    private Integer id;

    private String title;

    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "post")//, cascade = CascadeType.ALL)
    private List<Comment> comments;
}