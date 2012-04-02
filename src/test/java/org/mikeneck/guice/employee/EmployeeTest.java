package org.mikeneck.guice.employee;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:21
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeTest {

    private Employee employee;

    @Before
    public void setUp () {
        this.employee = null;
    }

    @Test
    public void testStaff() {
        employee = new Staff();
        String hello = employee.sayHello();
        assertThat(hello.endsWith("sir."), is(true));
        assertThat(hello.startsWith("good"), is(true));
    }

    @Test
    public void testManager() {
        employee = new Manager();
        String hello = employee.sayHello();
        assertThat(hello.endsWith("everyone."), is(true));
        assertThat(hello.startsWith("Good"), is(true));
    }
}
