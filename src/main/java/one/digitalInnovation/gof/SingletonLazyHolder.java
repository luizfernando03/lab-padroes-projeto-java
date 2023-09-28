package one.digitalInnovation.gof;

/**
 * Singleton "preguicoso".
 *
 * @author luizfernando03
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
