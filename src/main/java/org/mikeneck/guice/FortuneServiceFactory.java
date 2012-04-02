package org.mikeneck.guice;

import org.mikeneck.guice.fortune.FortuneService;
import org.mikeneck.guice.fortune.FortuneServiceImpl;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/20
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 */
public class FortuneServiceFactory {

    private static FortuneService fortuneService = new FortuneServiceImpl();

    private FortuneServiceFactory () {
    }

    public static FortuneService getFortuneService() {
        return fortuneService;
    }

    public static void setFortuneService(FortuneService mockFortuneService) {
        fortuneService = mockFortuneService;
    }
}
