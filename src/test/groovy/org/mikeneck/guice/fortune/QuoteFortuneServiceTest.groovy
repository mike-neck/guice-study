package org.mikeneck.guice.fortune

import org.junit.Test
import org.junit.Before

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
class QuoteFortuneServiceTest {

    QuoteFortuneService service

    @Before
    public void setUp () {
        service = new QuoteFortuneService()
    }

    @Test
    public void test() {
        52.times {
            assert service.charrify() in ('a'..'z')
        }
    }

    @Test
    public void testNumber() {
        20.times {
            assert service.number() in (3..12)
        }
    }

    @Test
    public void testService() {
        assert service.randomFortune().length() in (3..12)
    }
}
