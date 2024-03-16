```java
import java.util.Scanner;

public class DateValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int a = Integer.parseInt(String.valueOf(n.charAt(0)) + String.valueOf(n.charAt(1)));
        int b = Integer.parseInt(String.valueOf(n.charAt(2)) + String.valueOf(n.charAt(3));

        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}
```
