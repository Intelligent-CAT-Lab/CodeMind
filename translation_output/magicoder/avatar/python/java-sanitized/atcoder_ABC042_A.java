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
        if (Arrays.stream(ABC).filter(x -> x == 5).count() == 2) {
            System.out.println(Arrays.stream(ABC).sum() == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}