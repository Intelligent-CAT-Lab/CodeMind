```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int n = Integer.parseInt(line.split(" ")[0]);
            System.out.println((int) Math.pow(n, 3));
        }
        
        scanner.close();
    }
}
```
