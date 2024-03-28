<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
count = 1
while count <= N:
    count *= 2
print(round(count/2))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        while (count <= N) {
            count *= 2;
        }
        System.out.println(Math.round(count / 2));
    }
}
```
<|endoftext|>
