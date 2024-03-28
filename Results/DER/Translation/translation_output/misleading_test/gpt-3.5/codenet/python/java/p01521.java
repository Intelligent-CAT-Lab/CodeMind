```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length() - 1);

        if (firstChar == 'x' && lastChar == 'x') {
            System.out.println("*");
        } else {
            System.out.println("o");
        }
    }
}
```
