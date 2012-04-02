package org.mikeneck.guice.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import org.mikeneck.guice.module.Chef;
import org.mikeneck.guice.binding.CommonSenseModule;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class FortuneApplication {

    public static void main (String[] args) {
        Injector injector = Guice.createInjector(Stage.DEVELOPMENT, new CommonSenseModule());
        Chef chef = injector.getInstance(Chef.class);
        chef.makeFortuneCookie();
    }
}
