package org.mikeneck.guice.binding;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.mikeneck.guice.model.Actor;
import org.mikeneck.guice.model.Cane;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class ActorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Actor.class)
                .annotatedWith(Names.named("cane"))
                .to(Cane.class);
    }
}
