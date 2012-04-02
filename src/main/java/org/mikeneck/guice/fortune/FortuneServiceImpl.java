package org.mikeneck.guice.fortune;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/20
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
public class FortuneServiceImpl implements FortuneService {

    private static final List<String> MESSAGES =
            Arrays.asList(
                    "Today you will have some refreshing juice.",
                    "Larry just bought your company."
            );

    @Override
    public String randomFortune() {
        return MESSAGES.get(new Random().nextInt(MESSAGES.size()));
    }
}
