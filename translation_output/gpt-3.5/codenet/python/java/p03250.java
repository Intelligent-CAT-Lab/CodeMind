```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] abc = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(abc);
        
        int result = Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0];
        
        System.out.println(result);
        
        scanner.close();
    }
}
```
