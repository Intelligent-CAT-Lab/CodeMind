<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
188 -48

```
a,b,c,d,e,f=map(int,input().split())
maxsugar=0
maxwater=100*a
for i in range(31):
    for j in range(31):
        for k in range(3001):
            water=100*a*i+100*b*j
            sugar=c*k
            if water+sugar>f:
                continue
            if sugar>(a*i+b*j)*e:
                continue
            sugar+=min((f-(water+sugar))//d*d,((a*i+b*j)*e-c*k)//d*d)
            if 100*maxsugar*(water+sugar)<100*sugar*(maxsugar+maxwater):
                maxsugar=sugar
                maxwater=water
print(maxsugar+maxwater,maxsugar)
```

### Response:
Here is the Java version of the provided Python code:

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
        for (int i = 0; i <= 30; i++) {
            for (int j = 0; j <= 30; j++) {
                for (int k = 0; k <= 3000; k++) {
                    int water = 100 * a * i + 100 * b * j;
                    int sugar = c * k;
                    if (water + sugar > f || sugar > (a * i + b * j) * e)
                        continue;
                    sugar += Math.min((f - (water + sugar)) / d * d, ((a * i + b * j) * e - c * k) / d * d);
                    if (100 * maxSugar * (water + sugar) < 100 * sugar * (maxSugar + maxWater)) {
                        maxSugar = sugar;
                        maxWater = water;
                    }
                }
            }
        }
        System.out.println(maxSugar + maxWater + " " + maxSugar);
    }
}
```

This Java code does the same thing as the Python code. It reads six integers from the input, then it iterates over possible combinations of water and sugar amounts, updating the maximum sugar and water amounts if the current combination provides a higher sugar-to-water ratio. Finally, it prints the total amount of sugar and the amount of sugar.
<|EOT|>
