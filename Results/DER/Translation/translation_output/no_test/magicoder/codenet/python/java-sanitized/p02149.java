import java.util.Arrays;
import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] S = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            S[i] = Integer.parseInt(input[i]);
        }
        int maxIndex = Arrays.asList(S).indexOf(Arrays.stream(S).max().getAsInt());
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }
    }
}