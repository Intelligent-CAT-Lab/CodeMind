<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
9


```
A, B = map(int, input().split())

list = [A+B, 2*A-1, 2*B-1]
print(max(list))


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] list = new int[3];
        list[0] = A+B;
        list[1] = 2*A-1;
        list[2] = 2*B-1;
        System.out.println(Math.max(list[0], Math.max(list[1], list[2])));
    }
}
```
<|endoftext|>
