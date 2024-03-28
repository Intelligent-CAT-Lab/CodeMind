```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] splitNum = num.split("\\.");

        if (Integer.parseInt(String.valueOf(splitNum[0].charAt(splitNum[0].length() - 1))) == 9) {
            System.out.println("GOTO ⮁ Vasilisa.");
        } else {
            if (Integer.parseInt(String.valueOf(splitNum[1].charAt(0))) >= 5) {
                System.out.println(Integer.parseInt(splitNum[0]) + 1);
            } else {
                System.out.println(splitNum[0]);
            }
        }
    }
}
```
