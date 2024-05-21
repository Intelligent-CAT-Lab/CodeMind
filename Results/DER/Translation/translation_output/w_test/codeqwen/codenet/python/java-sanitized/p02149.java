import java.util.Arrays;
import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] S = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxIndex = Arrays.stream(S).max().getAsInt();
        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }
    }
}