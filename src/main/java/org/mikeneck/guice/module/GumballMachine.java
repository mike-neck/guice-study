package org.mikeneck.guice.module;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.mikeneck.guice.module.Gum;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class GumballMachine {

    @Inject
    private Provider<Gum> gumProvider;

    public Gum dispense () {
        return gumProvider.get();
    }
}
