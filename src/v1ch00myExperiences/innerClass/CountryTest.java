package v1ch00myExperiences.innerClass;

/**
 * Created by WERT on 11.10.2017.
 */
public class CountryTest {


    public static void main(String[] args) {
        Country country = new Country();
        //country.getPeople();
        country.descriptionCity();
        country.getCity();

        Country.City CC = new Country().new City();  //доступ к внутреннему классу
    }
}
