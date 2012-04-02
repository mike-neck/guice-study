package org.mikeneck.guice.binding;

import com.google.inject.AbstractModule;
import org.mikeneck.guice.module.Chef;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 18:07
 * To change this template use File | Settings | File Templates.
 */
public class ExplicitChefModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Chef.class);
    }
}
