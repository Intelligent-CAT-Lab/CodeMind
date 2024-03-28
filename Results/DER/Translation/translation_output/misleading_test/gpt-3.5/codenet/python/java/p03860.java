```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        
        String A = input[0];
        String x = input[1];
        String C = input[2];
        
        System.out.println("A" + x.charAt(0) + "C");
    }
}
```
