package v1ch00myExperiences;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerFileTest {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(Paths.get("C:\\Users\\WERT\\IdeaProjects\\HorstmannTomOne\\src\\v1ch00myExperiences\\re.txt"), "UTF8");
            String str = in.nextLine();

            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
