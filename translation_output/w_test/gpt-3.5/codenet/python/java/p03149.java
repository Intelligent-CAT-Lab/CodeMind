```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        
        int[] a = Arrays.stream(input)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        
        int[] b = {1, 4, 7, 9};
        
        String ans = Arrays.equals(a, b) ? "YES" : "NO";
        System.out.println(ans);
    }
}
```
