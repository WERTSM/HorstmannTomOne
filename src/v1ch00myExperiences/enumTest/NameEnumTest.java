package v1ch00myExperiences.enumTest;

public class NameEnumTest {
    public static void main(String[] args) {
        NameEnum NE = NameEnum.MISHA;
        if(NE == NameEnum.MISHA) System.out.println("Михаил!!!");

        for (NameEnum nameEnum : NameEnum.values()){
            System.out.println(nameEnum.ordinal() + " " + nameEnum.toString()+ " " + nameEnum.getKlikuha());
        }
    }
}