```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        int w = Integer.parseInt(splitInput[0]);
        int h = Integer.parseInt(splitInput[1]);
        char c = splitInput[2].charAt(0);

        System.out.println("+" + "-".repeat(w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(w - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(w - 2) + "+");
    }
}
```
```
