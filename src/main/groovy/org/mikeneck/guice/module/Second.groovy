package org.mikeneck.guice.module

import org.mikeneck.guice.fortune.FortuneService
import com.google.inject.Inject
import org.mikeneck.guice.FortuneCookie

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:31
 * To change this template use File | Settings | File Templates.
 */
class Second implements Cook {

    final FortuneService service

    @Inject
    public Second(FortuneService service) {
        this.service = service
    }

    @Override
    void makeFortuneCookie () {
        new FortuneCookie(service.randomFortune())
    }
}
