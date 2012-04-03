package org.mikeneck.guice.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.mikeneck.guice.module.GumballMachine;

/**
 * @author: mike
 * @since: 12/04/03
 */
public class GumballSimpleExample {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector();
        GumballMachine machine = injector.getInstance(GumballMachine.class);
        System.out.println(machine.dispense());
        System.out.println(machine.dispense());
    }
}
