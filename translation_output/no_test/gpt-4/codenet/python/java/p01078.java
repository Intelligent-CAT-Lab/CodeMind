Here's the Python code translated to Java:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.1415926535897932384626433832795;
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        double area = N * Math.sin(PI / N) * Math.cos(K * PI / N) / Math.cos((K - 1) * PI / N);
        System.out.println(area);
        
        scanner.close();
    }
}
```

Make sure to provide appropriate class name based on the context/environment you are running this Java code. For example, if there is a specific naming requirement for a class in an online judge, you might need to name the class accordingly. Additionally, if you want more precise control over the output format, especially the number of decimal places, you could use `System.out.printf` or `java.text.DecimalFormat`.
