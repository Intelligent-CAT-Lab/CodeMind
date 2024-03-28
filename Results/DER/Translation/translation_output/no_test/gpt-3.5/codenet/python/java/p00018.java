```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Integer[] numbers = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
```
