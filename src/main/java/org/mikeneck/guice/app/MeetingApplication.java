package org.mikeneck.guice.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Stage;
import org.mikeneck.guice.binding.MeetingModule;
import org.mikeneck.guice.module.Meeting;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:12
 * To change this template use File | Settings | File Templates.
 */
public class MeetingApplication {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(Stage.DEVELOPMENT, new MeetingModule());
        Meeting meeting = injector.getInstance(Key.get(Meeting.class));
        meeting.firstVoice();
    }
}
