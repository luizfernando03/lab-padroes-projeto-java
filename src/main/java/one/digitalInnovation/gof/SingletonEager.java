package one.digitalInnovation.gof;

/**Singleton "apressado"
 *
 * @author luizfernando03
 */

public class SingletonEager extends SingletonLazy {
    private static SingletonLazy instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonLazy getInstance(){
        return instancia;
    }
}
