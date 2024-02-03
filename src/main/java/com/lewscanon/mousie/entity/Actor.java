/* Copyright © 2024 Lewis S. Bloch. All rights reserved. */
package com.lewscanon.mousie.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/** Domain entity: a Actor, e.g., a {@link Companion} or {@link Fluffie}. */
public interface Actor {

    /**
     * Unique handle attribute.
     * @return their handle.
     */
    String handle();

    /**
     * Name attribute.
     * @return their name.
     */
    String name();

    /**
     * Birthday attribute.
     * @return their birthday.
     */
    LocalDateTime birthday();


    // derived attributes

    /**
     * Age attribute.
     * @return age in years.
     */
    default int age() {
        return Period.between(birthday().toLocalDate(), LocalDate.now()).getYears();
    }

}
