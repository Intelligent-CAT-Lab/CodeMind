```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        String S = inputs[0];
        String T = inputs[1];

        System.out.println(T + "!" + S);
    }
}
```
