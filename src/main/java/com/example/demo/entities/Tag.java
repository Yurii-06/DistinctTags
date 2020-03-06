package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.ManyToAny;

@Entity
@RequiredArgsConstructor
@Data
public class Tag  {
//    @GeneratedValue(strategy= GenerationType.IDENTITY)
//    @Id
    Long id;

//    @Column(unique=true)
    @Id
    private final String name;

    @Cascade({CascadeType.PERSIST, CascadeType.MERGE})
    @ManyToMany(mappedBy = "tagSet")
    Set<Article> articleSet;
}
