```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();
        System.out.println(S.substring(0, 4).equals("YAKI") ? "Yes" : "No");
    }
}
```  
