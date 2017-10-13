package v1ch00myExperiences.innerClass;

/**
 * Created by WERT on 11.10.2017.
 */
public class Country {
    public String nameCountry = "Russia";
    private long people = 146_804_372;
    private long people2 = 146_804_372;
    public long getPeople() {
        return people;
    }

    void descriptionCity() {
        System.out.println("In " + nameCountry + " has " + getPeople() + " people");
    }

    /**
     * this.new City();  //Доступ к внутреннему конструктору.  this можно опускать
     */
    void getCity() {
        City city = this.new City();
        city.descriptionCity();
    }

    public class City {

        String nameCity = "Moscow";
        private long people = 12_380_664;

        //static String ivi(){}                     У внутреннего класса не может быть статических методов!!!!!
        long getPeople() {
            return people;
        }
        //long getPeople() { return people2; }      ИМЕЕТСЯ ДОСТУП К PRIVATE!
        /**
         * Country.this.getPeople()  //Доступ к внешному методу
         */

        void descriptionCity() {
            System.out.println("In " + nameCountry + " has " + Country.this.getPeople() + ", and in " + nameCity + " has " + getPeople() + " people");
        }
    }
}