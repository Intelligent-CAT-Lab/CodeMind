```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] s = Arrays.stream(inputs).mapToInt(Integer::parseInt).toArray();
        int[] s1 = s.clone();
        Arrays.sort(s1);
        System.out.println(s1[0] + " " + s1[1] + " " + s1[2]);
    }
}
```
