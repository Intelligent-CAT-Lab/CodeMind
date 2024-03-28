<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())

dic={}
for i in range(1,50001):
    p=int(i*1.08)
    dic[p]=i
if n in dic:
    print(dic[n])
else:
    print(":(")
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i * 1.08);
            dic.put(p, i);
        }
        if (n == dic.get(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(":(");
        }
    }
}
```</s>
