/* Copyright © 2024 Lewis S. Bloch. All rights reserved. */
package com.lewscanon.mousie.entity.reified;

import com.lewscanon.mousie.entity.Companion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

/**
 * Concrete {@link Companion}.
 */
@Entity
@Table(name = "Companion")
public class Companionty implements Companion {

    @Id
    private String handle;

    private String name;
    private LocalDateTime birthday;

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String handle() {
        return this.handle;
    }

    @Override
    public LocalDateTime birthday() {
        return this.birthday;
    }

    /**
     * Set {@code name} attribute.
     * @param name new value.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set {@code handle} attribute.
     * @param handle new value.
     */
    public void setHandle(String handle) {
        this.handle = handle;
    }

    /**
     * Set {@code birthday} attribute.
     * @param birthday new value.
     */
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }
}
