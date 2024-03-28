```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        
        if(a1 == a2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```  
