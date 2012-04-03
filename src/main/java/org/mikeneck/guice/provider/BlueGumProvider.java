package org.mikeneck.guice.provider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.mikeneck.guice.color.Color;
import org.mikeneck.guice.module.Gum;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class BlueGumProvider implements Provider<Gum> {

    @Inject
    private Color color;

    @Override
    public Gum get() {
        return new Gum(color);
    }
}
