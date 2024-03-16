<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())

result = []
for i in range(1, int(n**(1/2)+1)):
    if n%i==0:
        result.append(max(len(str(i)), len(str(n//i))))
print(min(result))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result[i] = Math.max(result[i], result[n / i]);
                result[n / i] = Math.max(result[i], result[n / i]);
            }
        }
        System.out.println(result[1]);
    }
}
```
<|endoftext|>
