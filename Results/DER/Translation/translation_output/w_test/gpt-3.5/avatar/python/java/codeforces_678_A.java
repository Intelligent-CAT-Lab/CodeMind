```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long vamshi = sc.nextLong();
        long z = sc.nextLong();
        
        long result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}
```
