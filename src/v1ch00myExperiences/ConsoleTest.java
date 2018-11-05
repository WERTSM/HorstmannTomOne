package v1ch00myExperiences;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {/*
        Console cons = System.console();

        String str = cons.readLine("Попробуй тут");
        System.out.println(str);
    }*/

            java.io.Console cons = java.lang.System.console();
            if (cons==null) {
                System.err.println("Can't initialize console!");
                return;
            }

            char[] passwd;

            passwd = cons.readPassword("%s", "Type password:");

            System.out.println("Checking password in secret area..");
            System.out.println(" -- Password var is: "+String.copyValueOf(passwd));

            System.out.println("Rewrite password variable with stars..");
            java.util.Arrays.fill(passwd, '*');

            System.out.println(" -- Password var is: "+String.copyValueOf(passwd));

            System.out.println("");

            String rl = cons.readLine("%s", "Type few words:");
            System.out.println("You type: "+rl);
        }

        public static void println(String str)
        {
            System.out.println(str);
        }

        public static void print(String str)
        {
            System.out.print(str);
        }
}