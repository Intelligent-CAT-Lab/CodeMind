<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> a = new ArrayList<>();
        for (String s : input) {
            a.add(Integer.parseInt(s));
        }
        Collections.sort(a);

        List<Integer> b = Arrays.asList(1, 4, 7, 9);

        String ans = a.equals(b) ? "YES" : "NO";
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into a list of strings, converts each string to an integer, and adds it to a list. It then sorts the list and compares it to a predefined list. If the lists are equal, it prints "YES", otherwise it prints "NO".<｜end▁of▁sentence｜>
