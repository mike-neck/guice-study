package org.mikeneck.guice.fortune

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 16:06
 * To change this template use File | Settings | File Templates.
 */
class FunnyFortuneService implements FortuneService {

    def funny = []

    FunnyFortuneService () {
        ['hop', 'step', 'jump'].each { item ->
            [3, 2, 5].each { num ->
                funny << "$num : $item"
            }
        }
    }

    @Override
    String randomFortune() {
        def rnd = Math.random() * funny.size() as int
        funny[rnd].toString()
    }
}
