```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int vamshi = Integer.parseInt(input[0]);
        int z = Integer.parseInt(input[1]);
        
        int result = ((vamshi / z) + 1) * z;
        
        System.out.println(result);
    }
}
```
