System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
k,s=map(int,input().split())
print(sum(0<=s-y-z<=k for z in range(k+1) for y in range(k+1)))
```


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        int sum = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (0 <= s - y - z && s - y - z <= k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
```

In this Java code, we use a nested for loop to iterate over all possible combinations of y and z. We check if the condition 0 <= s - y - z <= k is satisfied for each combination, and if it is, we increment the sum variable. Finally, we print the value of sum, which represents the number of valid combinations of y and z that satisfy the given condition.<|endoftext|>
