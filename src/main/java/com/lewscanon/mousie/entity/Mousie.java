/* Copyright © 2024 Lewis S. Bloch. All rights reserved. */
package com.lewscanon.mousie.entity;

import java.time.ZonedDateTime;
import java.util.List;

/** Domain entity: in the stable of a {@link Companion}. */
public interface Mousie extends Person {
    /**
     * {@link Companion} for this {@link Mousie}.
     * @return associated {@link Companion}.
     */
    Companion companion();

    /**
     * Obtain this {@link Mousie}'s history.
     * @return this {@link Mousie}'s history.
     */
    List<FluffieEvent> getHistory();

    /** Historical events. */
    record FluffieEvent ( ZonedDateTime date, Fluffie fluffie, String description ) {}
}
