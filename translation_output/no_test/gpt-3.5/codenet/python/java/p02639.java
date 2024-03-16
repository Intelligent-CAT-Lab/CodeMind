```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");
        int[] xList = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            xList[i] = Integer.parseInt(inputArray[i]);
        }

        for (int i = 0; i < 5; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
```
