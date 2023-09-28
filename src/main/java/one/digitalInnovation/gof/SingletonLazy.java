package one.digitalInnovation.gof;

/**
 * Singleton "preguicoso".
 *
 * @author luizfernando03
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    public SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia ==null){
            instancia = new SingletonLazy();

        }
        return instancia;
    }
}


