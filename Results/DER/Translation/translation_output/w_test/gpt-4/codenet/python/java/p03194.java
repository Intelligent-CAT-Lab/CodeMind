Below is the translated Java code:
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();

        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            int ans = 1;
            int count = 2;
            long tmp = (long) Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p = p / tmp;
                    count -= 1;
                }
                count += 1;
                tmp = (long) Math.pow(count, n);
            }
            System.out.println(ans);
        }
    }
}
```

To run a test case on the Java program, you can use the following as your input (for example, with a file or command line redirection):
```
3 24
```

The expected output for this test case should be:
```
2
```
