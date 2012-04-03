package org.mikeneck.guice.module;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.mikeneck.guice.model.Setting;

/**
 * @author: mike
 * @since: 12/04/04
 */
public class ConcertHall {

    @Inject
    @Named("capacity")
    private int capacity;

    @Inject
    @Named("type")
    private Class<?> type;

    @Inject
    @Named("setting")
    private Setting setting;

    @Override
    public String toString() {
        return String.format("%s[capacity : %s]",
                getClass().getName(), capacity);
    }

    public int getCapacity() {
        return capacity;
    }
}
