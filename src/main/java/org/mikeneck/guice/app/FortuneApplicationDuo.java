package org.mikeneck.guice.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Stage;
import org.mikeneck.guice.binding.ChefModule;
import org.mikeneck.guice.binding.CommonSenseModule;
import org.mikeneck.guice.binding.ExplicitChefModule;
import org.mikeneck.guice.module.Chef;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: mike
 * Date: 12/03/25
 * Time: 3:43
 * To change this template use File | Settings | File Templates.
 */
@Deprecated
public class FortuneApplicationDuo {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 1) {
            Injector injector = Type.injector();
            Chef chef = injector.getInstance(Chef.class);
            chef.makeFortuneCookie();
        }
    }

    static enum Type {
        Normal {
            @Override
            Module configure() {
                return new ChefModule();
            }
        }, Common {
            @Override
            Module configure() {
                return new CommonSenseModule();
            }
        }, Explicit {
            @Override
            Module configure() {
                return new ExplicitChefModule();
            }
        };

        public static Injector injector() {
            Type type = which();
            System.out.println(type);
            Module module = type.configure();
            return Guice.createInjector(Stage.DEVELOPMENT, module);
        }

        public static Type which() {
            List<Type> list = new ArrayList<Type>();
            for (Type type : values()) {
                list.add(type);
            }

            int rand = new Random().nextInt(list.size());
            return list.get(rand);
        }

        abstract Module configure();
    }
}
