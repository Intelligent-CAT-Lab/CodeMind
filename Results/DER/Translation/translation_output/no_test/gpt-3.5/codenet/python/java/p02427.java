```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.print(i + ":");
            for (int v = 0; v < n; v++) {
                if ((i & (1 << v)) > 0) {
                    System.out.print(" " + v);
                }
            }
            System.out.println();
        }
    }
}
```  
