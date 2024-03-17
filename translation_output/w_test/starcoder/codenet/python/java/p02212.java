<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3 4

Expected output:
0


```
l = sorted(list(map(int, input().split())))

print(abs((l[0] + l[3]) - (l[1] + l[2])))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        System.out.println(Math.abs((l[0] + l[3]) - (l[1] + l[2])));
    }
}
```
<|endoftext|>
