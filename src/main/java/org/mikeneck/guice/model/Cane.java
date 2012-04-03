package org.mikeneck.guice.model;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class Cane implements Actor {

    @Override
    public String getName() {
        return "Joe";
    }

    @Override
    public String getActorName() {
        return "Cane";
    }
}
