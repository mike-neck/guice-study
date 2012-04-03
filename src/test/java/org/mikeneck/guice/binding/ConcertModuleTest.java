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
public class ConcertModuleTest {

    private Injector injector;

    @Before
    public void setUp () {
        injector = Guice.createInjector(new ConcertModule());
    }

    @Test
    public void test () {
        ConcertHall concertHall = injector.getInstance(ConcertHall.class);
        assertThat(concertHall.getCapacity(), is(401));
    }
}
