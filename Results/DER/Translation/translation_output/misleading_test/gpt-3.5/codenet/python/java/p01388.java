```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int K = 0, U = 0, P = 0, C = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'K') K++;
            else if(a.charAt(i) == 'U') U++;
            else if(a.charAt(i) == 'P') P++;
            else if(a.charAt(i) == 'C') C++;
        }

        System.out.println(Math.min(Math.min(K, U), Math.min(P, C)));
    }
}
```
