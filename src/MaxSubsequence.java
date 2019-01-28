import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class MaxSubsequence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите размер последовательности целых чисел: ");
        int sizeSeq = input.nextInt();
        int sequence[] = new int[sizeSeq];

        System.out.println("Введите элементы этой последовательности:");
        for (int i = 0; i < sizeSeq; i++)
            sequence[i] = input.nextInt();

        System.out.print("Данная числовая последовательность целых чисел:");
        for (int i = 0; i < sizeSeq; i++)
            System.out.print(" " + sequence[i]);

        System.out.println();

        ArrayList<String> subsequences = new ArrayList<>();
        int startSub = -1;
        int finishSub = 0;
        int maxLengthSub = 0;
        int numberOfSub = 0;
        String subsequence = "";

        for (int i = 0; i < sequence.length; i++) {

            if (startSub == -1) {
                startSub = i;
                subsequence = "" + sequence[i];
            }
            if (i == sequence.length - 1 || sequence[i] >= sequence[i + 1]) {
                if (finishSub - startSub + 1 > maxLengthSub) {
                    maxLengthSub = finishSub - startSub + 1;
                    numberOfSub = 1;
                    subsequences.add(subsequence);
                } else if (finishSub - startSub + 1 == maxLengthSub) {
                    numberOfSub++;
                    subsequences.add(subsequence);
                }
                startSub = -1;
            } else {
                finishSub = i + 1;
                subsequence = subsequence + " " + sequence[finishSub];
            }

        }

        System.out.println();
        System.out.println("Длина непрерывной строго возрастающей подпоследовательности: " + maxLengthSub);
        System.out.println("Количество таких подпоследовательностей: " + numberOfSub);
        System.out.println("Подпоследовательности: ");

        ListIterator li = subsequences.listIterator(subsequences.size());
        for (int i = 0; i < numberOfSub && li.hasPrevious(); i++)
            System.out.println(li.previous());
    }
}