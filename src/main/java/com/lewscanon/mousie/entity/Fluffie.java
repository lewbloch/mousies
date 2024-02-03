/* Copyright © 2024 Lewis S. Bloch. All rights reserved. */
package com.lewscanon.mousie.entity;

/** Domain entity: friend of a Companion. */
public interface Fluffie extends Actor {
    /**
     * {@link Companion} for this {@link Fluffie}.
     * @return associated {@link Companion}.
     */
    Companion companion();

}
