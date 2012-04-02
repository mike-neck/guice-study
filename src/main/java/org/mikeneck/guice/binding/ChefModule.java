package org.mikeneck.guice.binding;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scopes;
import org.mikeneck.guice.annotations.Mega;
import org.mikeneck.guice.fortune.FortuneService;
import org.mikeneck.guice.fortune.FortuneServiceImpl;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/20
 * Time: 13:08
 * To change this template use File | Settings | File Templates.
 */
public class ChefModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(FortuneService.class)
                .annotatedWith(Mega.class)
                .to(FortuneServiceImpl.class)
                .in(Scopes.SINGLETON);
    }
}
