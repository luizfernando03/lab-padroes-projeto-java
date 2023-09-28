package one.digitalInnovation.gof;

import java.lang.System;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();

        SingletonEager eager = (SingletonEager) SingletonEager.getInstancia();


    }
}
