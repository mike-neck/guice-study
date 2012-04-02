package org.mikeneck.guice.binding;

import com.google.inject.AbstractModule;
import org.mikeneck.guice.module.Meeting;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:13
 * To change this template use File | Settings | File Templates.
 */
public class MeetingModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(Meeting.class);
    }
}
