```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= (int) Math.sqrt(n)+1; i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int length : result) {
            if (length < min) {
                min = length;
            }
        }

        System.out.println(min);
    }
}
```
