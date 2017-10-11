package v0myExperiences.innerClass.Interface;

/**
 * Created by GrandMaster WERT on 10.10.2017.
 */
public class A implements A_Interface,B_Interface {

    @Override
    public void t() {

    }

    public String message() {
        return "ПРИВЕТ";
    }

    public String pipi() {
        return A_Interface.super.pipi();

    }
}
