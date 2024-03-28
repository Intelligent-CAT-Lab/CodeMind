```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((double) (N + 1) / N / 2);
        }
    }
}
``` 

Test input:
64

Expected output:
22.04590006873798
