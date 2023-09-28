package one.digitalInnovation.gof;

import sigleton.SingletonEager;
import sigleton.SingletonLazy;
import sigleton.SingletonLazyHolder;
import strategy.*;

import java.lang.System;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();

        SingletonEager eager = (SingletonEager) SingletonEager.getInstancia();
        System.out.println(eager);
        eager = (SingletonEager) SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        Facade

        Facade facade = new Facade();
        facade.migrarCliente("Luiz", "14801788");
    }


}
