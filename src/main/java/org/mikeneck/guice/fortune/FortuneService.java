package org.mikeneck.guice.fortune;

import com.google.inject.ImplementedBy;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/20
 * Time: 11:53
 * To change this template use File | Settings | File Templates.
 */
@ImplementedBy(FortuneServiceImpl.class)
public interface FortuneService {

    public String randomFortune();
}
