package org.mikeneck.guice.binding;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;
import org.mikeneck.guice.color.Color;
import org.mikeneck.guice.model.Setting;
import org.mikeneck.guice.module.ConcertHall;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author : mike
 * @since : 12/04/04
 */
public class ConcertExtendModuleTest {

    private Injector injector;

    @Before
    public void setUp () {
        injector = Guice.createInjector(new ConcertExtendModule());
    }

    @Test
    public void test () {
        ConcertHall hall = injector.getInstance(ConcertHall.class);

        assertThat(hall.getCapacity(), is(201));
        assertThat(hall.getType().equals(Color.class), is(true));
        assertThat(hall.getSetting(), is(Setting.INDOOR));
    }
}
