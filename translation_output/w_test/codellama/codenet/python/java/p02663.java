<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 0 15 0 30

Expected output:
270


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
This code first reads the input from the user, then it splits the input into an array of strings using the `split()` method. It then converts each element of the array into an integer using the `Integer.parseInt()` method.

The code then calculates the total time in minutes for both the start and end times using the formula `60 * h + m`, where `h` is the hour and `m` is the minute.

Finally, the code subtracts the total time for the end time from the total time for the start time, and subtracts the number of minutes that the person has been awake from the result. The result is then printed to the console.</s>
