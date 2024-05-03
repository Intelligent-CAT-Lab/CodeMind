Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 50 - b; i < 50; i++) {
            ans.add(String.valueOf(a + i));
        }
        for (int i = 0; i < b; i++) {
            ans.add(String.valueOf(a + 50 - b + i + 1));
        }
        String[] ansArray = new String[ans.size()];
        ansArray = ans.toArray(ansArray);
        System.out.println(String.join(" ", ansArray));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, prints 50, calculates the quotient and remainder when dividing the input by 50, and then creates an ArrayList of Strings. It then adds the appropriate numbers to the ArrayList based on the quotient and remainder, and finally prints the ArrayList as a space-separated string.
