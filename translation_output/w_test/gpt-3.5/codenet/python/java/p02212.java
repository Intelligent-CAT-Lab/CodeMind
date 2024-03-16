```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] l = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        System.out.println(Math.abs((l[0] + l[3]) - (l[1] + l[2])));
    }
}
```
