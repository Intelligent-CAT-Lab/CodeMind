<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 +

Expected output:
3


```
n = input().split()
s = []
for i in range(len(n)):
    if n[i] == "+":
        a = s.pop()
        b = s.pop()
        s.append(b + a)
    elif n[i] == "-":
        a = s.pop()
        b = s.pop()
        s.append(b - a)
    elif n[i] == "*":
        a = s.pop()
        b = s.pop()
        s.append(b * a)
    else:
        s.append(int(n[i]))
print(s.pop())

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals("+")) {
                int b = s.remove(s.size() - 1);
                int a = s.remove(s.size() - 1);
                s.add(b + a);
            } else if (n[i].equals("-")) {
                int b = s.remove(s.size() - 1);
                int a = s.remove(s.size() - 1);
                s.add(b - a);
            } else if (n[i].equals("*")) {
                int b = s.remove(s.size() - 1);
                int a = s.remove(s.size() - 1);
                s.add(b * a);
            } else {
                s.add(Integer.parseInt(n[i]));
            }
        }
        System.out.println(s.remove(s.size() - 1));
    }
}
```</s>
