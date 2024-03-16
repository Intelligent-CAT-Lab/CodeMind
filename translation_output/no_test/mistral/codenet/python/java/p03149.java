<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        List<Integer> list = Arrays.asList(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        Collections.sort(list);
        List<Integer> b = Arrays.asList(1, 4, 7, 9);
        if (list.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```</s>
