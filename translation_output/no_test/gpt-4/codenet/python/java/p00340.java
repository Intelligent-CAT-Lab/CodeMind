Here's the equivalent Java code for the Python snippet you provided:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] num = new int[inputs.length];
        
        for (int i = 0; i < inputs.length; i++) {
            num[i] = Integer.parseInt(inputs[i]);
        }
        
        Arrays.sort(num);
        
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        scanner.close();
    }
}
```

Remember that Java is a statically typed language, so you must declare the type of each variable. Also, Java uses different methods for sorting and reading input from the console.
