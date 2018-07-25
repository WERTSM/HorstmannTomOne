package v1ch00myExperiences.enumTest;

enum NameEnum{
    VASYA ("Васёк") ,PETYA("Петёк"),MISHA("Мих"),SERGEY("Сер");
    NameEnum(String klikuha){
        this.klikuha=klikuha;
    }
    private String klikuha;
    public String getKlikuha() { return klikuha; }
}
