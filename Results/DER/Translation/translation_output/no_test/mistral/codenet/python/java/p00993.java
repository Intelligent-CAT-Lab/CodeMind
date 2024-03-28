<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = reduce(lambda x, y: x*y, range(1, 1501));
        result++;
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= scanner.nextInt(); i++) {
            System.out.println(i+1);
        }
    }

    public static int reduce(int[] x, int lambda) {
        int result = 1;
        for (int i = 0; i < x.length; i++) {
            result *= lambda;
        }
        return result;
    }
}
```</s>
