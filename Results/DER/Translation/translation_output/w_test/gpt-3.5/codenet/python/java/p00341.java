```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        for (int i = 0; i < 12; i++) {
            int num = Integer.parseInt(input[i]);
            a[num - 1]++;
        }

        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                count += a[i] / 4;
            }
        }

        if (count == 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```
