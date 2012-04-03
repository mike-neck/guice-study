package org.mikeneck.guice.binding;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;
import org.mikeneck.guice.module.ConcertHall;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author: mike
 * @since: 12/04/04
 */
public class ConcertStringModuleTest {

    private Injector injector;

    @Before
    public void setUp () {
        injector = Guice.createInjector(new ConcertStringModule());
    }

    @Test
    public void test() {
        ConcertHall hall = injector.getInstance(ConcertHall.class);
        assertThat(hall.getCapacity(), is(200));
    }
}
