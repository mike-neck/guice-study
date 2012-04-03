package org.mikeneck.guice.binding;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;
import org.mikeneck.guice.module.ActionMovie;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class ActorModuleTest {

    private Injector injector;

    @Before
    public void setUp () {
        injector = Guice.createInjector(new ActorModule());
    }

    @Test
    public void test() {
        ActionMovie movie = injector.getInstance(ActionMovie.class);
        assertThat(movie.display(), is("Joe : Cane"));
    }
}
