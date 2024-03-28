```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int target = 1;
        while (true) {
            int count = 0;
            for (int i = 1; i <= target; i++) {
                if (target % i == 0) {
                    count++;
                }
            }
            if (count == N) {
                System.out.println(target);
                break;
            }
            target++;
        }
    }
}
```
