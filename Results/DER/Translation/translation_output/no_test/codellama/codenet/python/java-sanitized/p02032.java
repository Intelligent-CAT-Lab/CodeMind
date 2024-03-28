import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class p02032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        Map<Integer, Integer> primeFactors = new HashMap<>();
        int num = n;
        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                primeFactors.put(i, 1);
                num /= i;
            }
        }

        if (num > 1) {
            primeFactors.put(num, 1);
        }

        int count = 0;
        for (int i : primeFactors.keySet()) {
            count += primeFactors.get(i);
        }

        System.out.println(count);
    }
}