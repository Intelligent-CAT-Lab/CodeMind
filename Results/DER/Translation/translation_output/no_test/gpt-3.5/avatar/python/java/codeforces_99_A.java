```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] num = scanner.nextLine().split("\\.");

        if (Integer.parseInt(String.valueOf(num[0].charAt(num[0].length() - 1))) == 9) {
            System.out.println("GOTO â Vasilisa.");
        } else {
            if (Integer.parseInt(String.valueOf(num[1].charAt(0))) >= 5) {
                System.out.println(Integer.parseInt(num[0]) + 1);
            } else {
                System.out.println(num[0]);
            }
        }
    }
}
```
