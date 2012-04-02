package org.mikeneck.guice.fortune

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/24
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
class QuoteFortuneService implements FortuneService {

    @Override
    String randomFortune() {
        def list = []
        number().times {
            list << charrify()
        }
        list.join()
    }

    def a = 'a' as char

    def number = {(Math.random() * 10 as int) + 3}

    def charrify = {((a + (Math.random() * 26 as int )) as char)}
}
