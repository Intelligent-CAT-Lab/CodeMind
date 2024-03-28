<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 0 15 0 30

Expected output:
276

```

h1, m1, h2, m2, k = map(int, input().split())
#ä¸è¡ã§å¥åãããæ°å¤ãããããã®å¤æ°ã«
#3ã¤ä»¥ä¸ãå¯

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print(t2-t1-k)

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int h1 = Integer.parseInt(input[0]);
        int m1 = Integer.parseInt(input[1]);
        int h2 = Integer.parseInt(input[2]);
        int m2 = Integer.parseInt(input[3]);
        int k = Integer.parseInt(input[4]);

        int t1 = 60 * h1 + m1;
        int t2 = 60 * h2 + m2;

        System.out.println(t2 - t1 - k);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it splits the input string into an array of strings using the `split()` method. It then converts each string to an integer using the `parseInt()` method and stores the values in the `h1`, `m1`, `h2`, `m2`, and `k` variables.

Next, it calculates the total time in minutes for the two times using the formula `60 * h1 + m1` and `60 * h2 + m2`. It then subtracts the total time for the first time from the total time for the second time, and subtracts the value of `k` from the result. Finally, it prints the result using the `System.out.println()` method.</s>
