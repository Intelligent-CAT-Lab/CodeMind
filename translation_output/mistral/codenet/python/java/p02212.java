<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
l = sorted(list(map(int, input().split())))

print(abs((l[0] + l[3]) - (l[1] + l[2])))

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        List<Integer> list = Arrays.asList(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
        Collections.sort(list);
        int result = Math.abs(list.get(0) + list.get(3) - (list.get(1) + list.get(2)));
        System.out.println(result);
    }
}
```</s>
