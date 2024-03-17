import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        if (Arrays.equals(s, new String[]{"STOP"})) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}