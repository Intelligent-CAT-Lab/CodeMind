import java.util.Scanner;
import static java.lang.Math.ceil;
import static java.lang.Math.log;
import static java.lang.Math.pow;

public class p03923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        scanner.close();

        int t = n;
        for (int k = 1; k <= ceil(log(n) / log(2)); k++) {
            int d = (int) ceil(pow(n,