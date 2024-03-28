```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split("/");
        String A = inputs[0];
        String B = inputs[1];
        String C = inputs[2];

        if (Integer.parseInt(A) <= 2018) {
            System.out.println("Heisei");
        } else if (Integer.parseInt(A) == 2019 && Integer.parseInt(B) <= 4 && Integer.parseInt(C) <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```
