import java.util.Scanner;
import java.util.Arrays;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String output = "";
        for (int i = 0; i < n / 4; i++) {
            output += "abcd";
        }
        output += "abc"[n % 4];
        System.out.println(output);
    }
}