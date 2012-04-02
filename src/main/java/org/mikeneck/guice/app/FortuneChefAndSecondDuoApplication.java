package org.mikeneck.guice.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import org.mikeneck.guice.binding.ScopedModule;
import org.mikeneck.guice.module.Chef;
import org.mikeneck.guice.module.Cook;
import org.mikeneck.guice.module.Second;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:42
 * To change this template use File | Settings | File Templates.
 */
public class FortuneChefAndSecondDuoApplication {

    private Cook cook;

    public FortuneChefAndSecondDuoApplication(Cook cook) {
        this.cook = cook;
    }

    public void run() {
        cook.makeFortuneCookie();
    }

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(Stage.DEVELOPMENT, new ScopedModule());
        FortuneChefAndSecondDuoApplication application1 =
                new FortuneChefAndSecondDuoApplication(injector.getInstance(Chef.class));
        FortuneChefAndSecondDuoApplication application2 =
                new FortuneChefAndSecondDuoApplication(injector.getInstance(Second.class));
        application2.run();
        application1.run();
    }

}
