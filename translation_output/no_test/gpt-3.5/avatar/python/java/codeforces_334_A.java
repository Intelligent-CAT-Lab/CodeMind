```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 1;
        int j = n * n;

        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }
}
```
