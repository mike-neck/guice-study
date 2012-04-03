package org.mikeneck.guice.module;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.mikeneck.guice.color.Color;

import java.util.Date;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class Gum {

    private final Date date;

    private final Color color;

    public Gum() {
        date = new Date();
        color = Color.WHITE;
    }

    public Gum(Color color) {
        date = new Date();
        this.color = color;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Gum")
                .append("color", color)
                .append("date", date)
                .toString();
    }
}
