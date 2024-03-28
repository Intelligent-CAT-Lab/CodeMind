<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
19

```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
print(1 if sum >= 1000 else 0)

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c5 = sc.nextInt();
        int c10 = sc.nextInt();
        int c50 = sc.nextInt();
        int c100 = sc.nextInt();
        int c500 = sc.nextInt();
        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;
        System.out.println(1 if sum >= 1000 else 0);
    }
}
```
'''
<|endoftext|>
