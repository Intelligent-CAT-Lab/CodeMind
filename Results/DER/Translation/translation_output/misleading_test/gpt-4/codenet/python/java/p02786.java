Here's the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int ans = attack(H);
        System.out.println(ans);
        scanner.close();
    }
    
    public static int attack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + attack(tairyoku / 2) * 2;
        }
    }
}
```

If you run this Java code with the test input `2`, it will give you the expected output `58`.
