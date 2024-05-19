System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] counts = new int[3];
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'a':
                    counts[0]++;
                    break;
                case 'b':
                    counts[1]++;
                    break;
                case 'c':
                    counts[2]++;
                    break;
            }
        }
        int a = counts[0];
        int b = counts[1];
        int c = counts[2];
        int maxDiff = Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a)));
        if (maxDiff <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code reads a string from the user, counts the occurrences of each character in the string, and then checks if the absolute difference between any two counts is at most 1. If it is, it prints "YES", otherwise it prints "NO".<|endoftext|>
