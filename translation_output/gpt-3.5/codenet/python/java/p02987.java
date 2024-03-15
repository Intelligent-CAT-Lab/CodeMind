```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char b = scanner.next().charAt(0);
        char c = scanner.next().charAt(0);
        char d = scanner.next().charAt(0);
        int flag = 0;
        
        if(a == b && c == d) {
            flag = 1;
        } else if(a == c && b == d) {
            flag = 1;
        } else if(a == d && b == c) {
            flag = 1;
        } 
        
        if(a == b && a == c && a == d) {
            flag = 0;
        }
        
        if(flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```  
