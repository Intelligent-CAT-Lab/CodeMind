<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

h, a, b = map(int, input().split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        for (int c = a; c <= b; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses a `for` loop to iterate over the range of values from `a` to `b` and checks if `h` is divisible by `a + c` for each value of `c`. If it is divisible, it increments the `count` variable. Finally, it prints the value of `count`.</s>
