package com.yasynskyi.MyBlog;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_id_gen")
    @SequenceGenerator(name = "post_id_name", sequenceName = "post_id_name", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String title;
    private String content;
}
