package org.mikeneck.guice.binding;

import com.google.inject.AbstractModule;
import org.mikeneck.guice.fortune.FortuneService;
import org.mikeneck.guice.annotations.Mega;
import org.mikeneck.guice.fortune.FortuneServiceImpl;
import org.mikeneck.guice.fortune.MegaFortuneService;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 17:22
 * To change this template use File | Settings | File Templates.
 */
public class CommonSenseModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FortuneService.class).to(FortuneServiceImpl.class);
        bind(FortuneService.class)
                .annotatedWith(Mega.class)
                .to(MegaFortuneService.class);
    }
}
