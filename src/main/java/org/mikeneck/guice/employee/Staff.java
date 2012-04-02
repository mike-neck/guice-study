package org.mikeneck.guice.employee;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:06
 * To change this template use File | Settings | File Templates.
 */
public class Staff implements Employee {
    @Override
    public String sayHello() {
        return "good morning sir.";
    }
}
