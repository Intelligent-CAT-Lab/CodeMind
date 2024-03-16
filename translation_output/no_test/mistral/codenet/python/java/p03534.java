<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> dic = new HashMap<>();
        for (char c : s.toCharArray()) {
            dic.put(c, dic.getOrDefault(c, 0) + 1);
        }
        int a = dic.get('a');
        int b = dic.get('b');
        int c = dic.get('c');
        boolean result = Math.abs(a - b) <= 1 && Math.abs(b - c) <= 1 && Math.abs(c - a) <= 1;
        System.out.println(result ? "YES" : "NO");
    }
}
```</s>
