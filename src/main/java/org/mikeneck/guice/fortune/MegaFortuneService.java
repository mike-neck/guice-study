package org.mikeneck.guice.fortune;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 17:08
 * To change this template use File | Settings | File Templates.
 */
public class MegaFortuneService implements FortuneService {

    private static final List<FortuneService> SERVICES =
            Arrays.<FortuneService>asList(
                    new FunnyFortuneService(),
                    new QuoteFortuneService()
            );

    @Override
    public String randomFortune() {
        int index = new Random().nextInt(SERVICES.size());
        return SERVICES.get(index).randomFortune();
    }
}
