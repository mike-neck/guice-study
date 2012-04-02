package org.mikeneck.guice.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.mikeneck.guice.binding.EagerSingletonModule;
import org.mikeneck.guice.fortune.FortuneService;
import org.mikeneck.guice.module.Chef;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 8:51
 * To change this template use File | Settings | File Templates.
 */
public class FortuneSingletonApplication {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new EagerSingletonModule());
        Chef chef = injector.getInstance(Chef.class);
        chef.makeFortuneCookie();
    }
}
