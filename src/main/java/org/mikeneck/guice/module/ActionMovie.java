package org.mikeneck.guice.module;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.mikeneck.guice.model.Actor;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class ActionMovie {

    @Inject
    @Named("cane")
    private Actor actor;

    public String display () {
        return actor.getName() + " : " + actor.getActorName();
    }
}
