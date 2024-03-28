import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] ABC = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            ABC[i] = Integer.parseInt(input[i]);
        }
        if (countOccurrences(ABC, 5) == 2) {
            if (Arrays.stream(ABC).sum() == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i : arr) {
            if (i == target) {
                count++;
            }
        }
        return count;
    }
}