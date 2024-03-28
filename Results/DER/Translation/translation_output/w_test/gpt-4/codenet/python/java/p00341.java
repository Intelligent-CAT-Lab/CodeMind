Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            int bValue = Integer.parseInt(input[i]);
            a[bValue - 1]++;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}
```

You would need to run the above Java code to perform the same function as the provided Python script. Make sure that you have the input ready to enter after running the code as it reads from the standard input.
