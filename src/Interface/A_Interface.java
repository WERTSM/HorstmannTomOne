package Interface;

/**
 * Created by WERT on 10.10.2017.
 */
public  interface A_Interface {
    void t();
    String message();
    default String pipi(){
        return "PIPI";
    }
}
