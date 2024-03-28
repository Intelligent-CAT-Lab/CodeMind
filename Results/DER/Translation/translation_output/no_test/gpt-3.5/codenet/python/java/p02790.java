```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a <= b) {
            System.out.println(new String(new char[a]).replace("\0", Integer.toString(b)));
        } else {
            System.out.println(new String(new char[b]).replace("\0", Integer.toString(a)));
        }
        
        sc.close();
    }
}
```
