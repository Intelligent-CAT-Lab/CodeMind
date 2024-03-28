Here is the translated Java code for the provided Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();
        
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int minVal = Integer.MAX_VALUE;
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    minVal = Math.min(minVal, (i * j) % 2019);
                }
            }
            System.out.println(minVal);
        }
        
        sc.close();
    }
}
```

To run the test case, you can compile and execute this Java code, then provide the input `2020 2040`, and the program will output the expected result `2`.
