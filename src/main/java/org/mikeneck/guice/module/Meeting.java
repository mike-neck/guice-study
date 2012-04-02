package org.mikeneck.guice.module;

import com.google.inject.Inject;
import org.mikeneck.guice.employee.Employee;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:08
 * To change this template use File | Settings | File Templates.
 */
public class Meeting {

    private Employee employee;

    @Inject
    public Meeting(Employee employee) {
        this.employee = employee;
    }

    public void firstVoice() {
        System.out.println(employee.sayHello());
    }
}
