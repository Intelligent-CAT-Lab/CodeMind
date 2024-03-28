```java
import java.util.Scanner;

public class DnaPairing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String b = sc.nextLine();
        
        if (b.equals("A")) {
            System.out.println("T");
        } else if (b.equals("C")) {
            System.out.println("G");
        } else if (b.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}
```
