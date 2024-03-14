<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
_input = list(map(int, input().split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]

result = b // x - (a - 1)// x

print(result)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextInt();
        }
        int a = input[0];
        int b = input[1];
        int x = input[2];
        int result = b / x - (a - 1) / x;
        System.out.println(result);
    }
}
```
<|endoftext|>
