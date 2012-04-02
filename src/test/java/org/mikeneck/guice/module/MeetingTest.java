package org.mikeneck.guice.module;

import org.junit.Before;
import org.junit.Test;
import org.mikeneck.guice.employee.Employee;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:18
 * To change this template use File | Settings | File Templates.
 */
public class MeetingTest {

    private boolean called = false;

    @Before
    public void setUp () {
        this.called = false;
    }

    @Test
    public void testFirstVoice() {
        Meeting meeting = new Meeting(new MockEmployee());
        meeting.firstVoice();

        assertThat(this.called, is(true));
    }

    class MockEmployee implements Employee {

        @Override
        public String sayHello() {
            called = true;
            return "";
        }
    }
}
