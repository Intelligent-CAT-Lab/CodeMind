import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        Arrays.fill(ABC, scanner.nextInt());
        if (Arrays.asList(ABC).contains(5) == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}