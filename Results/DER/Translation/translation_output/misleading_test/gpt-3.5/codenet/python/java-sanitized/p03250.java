import java.util.Arrays;
import java.util.Scanner;

public class p03250 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");

        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(values[i]);
        }

        Arrays.sort(abc);
        int result = Integer.parseInt(Integer.toString(abc[2]) + Integer.toString(abc[1])) + abc[0];
        System.out.println(result);
    }
}