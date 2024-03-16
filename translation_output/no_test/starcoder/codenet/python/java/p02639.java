<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> x_list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            x_list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            if (x_list.get(i) == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
```
<|endoftext|>
