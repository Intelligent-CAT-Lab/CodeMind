<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] s = input.split(" ");
        int[] s1 = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            s1[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(s1);
        System.out.println(s1[0] + " " + s1[1] + " " + s1[2]);
    }
}
```</s>
