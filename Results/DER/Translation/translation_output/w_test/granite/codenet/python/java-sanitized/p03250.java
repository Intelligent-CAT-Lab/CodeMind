import java.util.Arrays;
import java.util.Scanner;

public class p03250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] abc = new int[3];
        for (int i = 0; i < 3; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(abc);
        int result = Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0];
        System.out.println(result);
    }
}