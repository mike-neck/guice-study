package org.mikeneck.guice.module;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author: mike
 * @since: 12/04/04
 */
public class ConcertHall {

    @Inject
    @Named("capacity")
    private int capacity;

    @Override
    public String toString() {
        return String.format("%s[capacity : %s]",
                getClass().getName(), capacity);
    }

    public int getCapacity() {
        return capacity;
    }
}
