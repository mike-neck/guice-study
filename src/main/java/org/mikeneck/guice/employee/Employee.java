package org.mikeneck.guice.employee;

import com.google.inject.ImplementedBy;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 7:04
 * To change this template use File | Settings | File Templates.
 */
@ImplementedBy(Staff.class)
public interface Employee {

    String sayHello();
}
