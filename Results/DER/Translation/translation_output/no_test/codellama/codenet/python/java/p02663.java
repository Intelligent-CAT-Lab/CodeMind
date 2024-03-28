<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:


h1, m1, h2, m2, k = map(int, input().split())
#ä¸è¡ã§å¥åãããæ°å¤ãããããã®å¤æ°ã«
#3ã¤ä»¥ä¸ãå¯

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print(t2-t1-k)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();

        int t1 = 60 * h1 + m1;
        int t2 = 60 * h2 + m2;

        System.out.println(t2 - t1 - k);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `System.out.println()` method is used to print the output to the console.</s>
