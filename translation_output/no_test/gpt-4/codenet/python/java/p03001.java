Below is the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        double mx = w / 2;
        double my = h / 2;
        
        double[] res = new double[2];
        res[0] = w * h / 2;
        res[1] = (x == mx && y == my) ? 1 : 0;
        
        System.out.println(res[0] + " " + res[1]);
    }
}
```

In the Java version, we use a `Scanner` to input the values for `w`, `h`, `x`, and `y`. We then perform the same calculations as in the Python code, storing the results in an array `res`. Finally, we print out the results. Note that in Java, it's necessary to declare the type of each variable; hence you see `double` before the variables `w`, `h`, etc.
