```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> makeDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        double MN = (double) M / N;
        ArrayList<Integer> divisor = makeDivisors(M);
        int maxGcd = 0;
        for (int d : divisor) {
            if (d <= MN && d >= maxGcd) {
                maxGcd = d;
            }
        }
        System.out.println(maxGcd);
    }
}
```
```
