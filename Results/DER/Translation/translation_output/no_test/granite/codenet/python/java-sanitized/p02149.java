import java.util.Arrays;
import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] S = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int maxIndex = 0;
        for (int i = 1; i < S.length; i++) {
            if (S[i] > S[maxIndex]) {
                maxIndex = i;
            }
        }
        switch (maxIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }
    }
}