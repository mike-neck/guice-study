package org.mikeneck.guice.module

import com.google.inject.Inject
import org.mikeneck.guice.annotations.Mega
import org.mikeneck.guice.fortune.FortuneService
import org.mikeneck.guice.FortuneCookie

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
class Chef implements Cook {

    final FortuneService service

    @Inject
    Chef(@Mega FortuneService service) {
        this.service = service
    }

    @Override
    void makeFortuneCookie () {
        new FortuneCookie(service.randomFortune())
    }
}
