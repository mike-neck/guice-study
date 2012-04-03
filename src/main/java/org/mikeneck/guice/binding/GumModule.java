package org.mikeneck.guice.binding;

import com.google.inject.AbstractModule;
import org.mikeneck.guice.module.Gum;
import org.mikeneck.guice.provider.GumProvider;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class GumModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Gum.class).toProvider(GumProvider.class);
    }
}
