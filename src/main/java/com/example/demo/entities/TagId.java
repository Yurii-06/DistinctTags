package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

public class TagId implements Serializable {
    private Long id;
    private String name;

    public TagId() { }

    public TagId(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TagId tagId = (TagId) o;
        return Objects.equals(id, tagId.id) &&
            Objects.equals(name, tagId.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
