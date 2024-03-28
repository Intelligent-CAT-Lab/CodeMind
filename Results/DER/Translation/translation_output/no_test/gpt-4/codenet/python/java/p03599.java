```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        
        int maxSugar = 0;
        int maxWater = 100 * a;
        
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 3001; k++) {
                    int water = 100 * a * i + 100 * b * j;
                    int sugar = c * k;
                    if (water + sugar > f) {
                        continue;
                    }
                    if (sugar > (a * i + b * j) * e) {
                        continue;
                    }
                    sugar += Math.min((f - (water + sugar)) / d * d, ((a * i + b * j) * e - c * k) / d * d);
                    if (100 * maxSugar * (water + sugar) < 100 * sugar * (maxWater + maxSugar)) {
                        maxSugar = sugar;
                        maxWater = water;
                    }
                }
            }
        }
        System.out.println((maxSugar + maxWater) + " " + maxSugar);
        
        scanner.close();
    }
}
```

I've translated the given Python code into Java. The translated Java code takes 6 integer inputs using a `Scanner`, and then executes nested loops, similar to the Python code. The loop ranges and data manipulation are kept consistent with the Python code. After calculating the maximum amounts of sugar and water, the code prints out the final result. Note that the division operator in Java inherently performs integer division when both operands are integers, so we do not need to explicitly floor the result as it occurs in Python with the `//` operator.
