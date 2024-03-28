```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();

        int N = S.length();

        int zero_start = 0;
        int zero_start_counter = 0;
        for (int i = 0; i < N; i++) {
            if (zero_start != Character.getNumericValue(S.charAt(i))) {
                zero_start_counter++;
            }
            zero_start = (zero_start + 1) % 2;
        }

        int one_start_counter = N - zero_start_counter;

        System.out.println(Math.min(zero_start_counter, one_start_counter));
    }
}
```

