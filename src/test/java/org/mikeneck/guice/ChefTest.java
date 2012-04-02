package org.mikeneck.guice;

import org.junit.Test;
import org.mikeneck.guice.fortune.FortuneService;
import org.mikeneck.guice.module.Chef;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/20
 * Time: 12:06
 * To change this template use File | Settings | File Templates.
 */
public class ChefTest {

    @Test
    public void makeFortuneCookie () {
        FortuneServiceMock mock = new FortuneServiceMock();
        Chef chef = new Chef(mock);
        chef.makeFortuneCookie();
        assertThat(mock.calledOnce(), is(true));
    }

    class FortuneServiceMock implements FortuneService {

        private int called = 0;

        @Override
        public String randomFortune() {
            called += 1;
            return "Mock";
        }

        public boolean calledOnce () {
            return called == 1;
        }
    }
}
