package org.mikeneck.guice.binding;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.Singleton;
import org.mikeneck.guice.annotations.Mega;
import org.mikeneck.guice.fortune.FortuneService;
import org.mikeneck.guice.fortune.FortuneServiceImpl;
import org.mikeneck.guice.fortune.MegaFortuneService;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:36
 * To change this template use File | Settings | File Templates.
 */
public class ScopedModule extends AbstractModule{
    @Override
    protected void configure() {
        bind(FortuneService.class)
                .to(FortuneServiceImpl.class)
                .in(Singleton.class);
        bind(FortuneService.class)
                .annotatedWith(Mega.class)
                .to(MegaFortuneService.class)
                .in(Scopes.SINGLETON);
    }
}
