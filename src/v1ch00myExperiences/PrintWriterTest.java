package v1ch00myExperiences;

import java.io.PrintWriter;

public class PrintWriterTest {
    public static void main(String[] args) throws Exception {
        PrintWriter file = new PrintWriter("C:\\Users\\WERT\\IdeaProjects\\HorstmannTomOne\\src\\v1ch00myExperiences\\Spartak.txt");
        file.write("Champion");
        file.close();

    }
}
