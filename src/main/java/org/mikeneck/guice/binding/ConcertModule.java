package org.mikeneck.guice.binding;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * @author: mike
 * @since: 12/04/04
 */
public class ConcertModule extends AbstractModule {
    @Override
    protected void configure() {
        bindConstant()
                .annotatedWith(Names.named("capacity"))
                .to(401);
    }
}
