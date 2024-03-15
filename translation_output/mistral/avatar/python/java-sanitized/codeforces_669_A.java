import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class codeforces_669_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        int result = 0;
        if (n % 3 == 0) {
            result = n / 3 * 2;
        } else if (n < 3) {
            result = 1;
        } else {
            result = n / 3 * 2 + 1;
        }
        System.out.println(result);
    }
}