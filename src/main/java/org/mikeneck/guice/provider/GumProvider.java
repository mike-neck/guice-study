package org.mikeneck.guice.provider;

import com.google.inject.Provider;
import org.mikeneck.guice.module.Gum;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class GumProvider implements Provider<Gum> {
    @Override
    public Gum get() {
        return new Gum();
    }
}
