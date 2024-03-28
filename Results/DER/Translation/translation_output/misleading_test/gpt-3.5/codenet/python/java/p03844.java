```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");

        int A = Integer.parseInt(inputArr[0]);
        String s = inputArr[1];
        int B = Integer.parseInt(inputArr[2]);

        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }
    }
}
```
