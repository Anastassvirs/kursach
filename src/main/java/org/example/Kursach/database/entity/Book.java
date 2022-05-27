package org.example.Kursach.database.entity;

import javax.persistence.*;

@Entity
@Table(name="books", schema = "public")
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;

    @Column(name = "author_id")
    private Long author_id;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAuthorId() {
        return author_id;
    }

    public void setAuthorId(Long authorId) {
        this.author_id = authorId;
    }
}

