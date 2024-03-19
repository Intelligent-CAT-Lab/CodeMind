<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abac

Expected output:
YEFS

```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Map<Character, Integer> dic = new HashMap<>();
        dic.put('a', 0);
        dic.put('b', 0);
        dic.put('c', 0);
        for (char c : s.toCharArray()) {
            dic.put(c, dic.get(c) + 1);
        }
        int a = dic.get('a');
        int b = dic.get('b');
        int c = dic.get('c');
        System.out.println(Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a))) <= 1 ? "YES" : "NO");
    }
}
```

This Java code does the same thing as the Python code. It counts the occurrences of 'a', 'b', and 'c' in the input string and then checks if the maximum difference between any two counts is less than or equal to 1. If it is, it prints "YES"; otherwise, it prints "NO".
<|EOT|>
