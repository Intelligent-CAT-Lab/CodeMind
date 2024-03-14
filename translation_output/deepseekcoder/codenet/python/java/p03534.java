<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('c', 0);
        for (char c : s.toCharArray()) {
            map.put(c, map.get(c) + 1);
        }
        int a = map.get('a');
        int b = map.get('b');
        int c = map.get('c');
        System.out.println(Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a))) <= 1 ? "YES" : "NO");
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, counts the occurrences of 'a', 'b', and 'c' in the string, and then checks if the maximum difference between any two counts is less than or equal to 1. If it is, it prints "YES"; otherwise, it prints "NO".
<|EOT|>
