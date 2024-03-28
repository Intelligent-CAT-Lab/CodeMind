<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.print("0".repeat(a) + "1".repeat(w - a));
            } else {
                System.out.print("1".repeat(a) + "0".repeat(w - a));
            }
            System.out.println();
        }
    }
}
```
Note that the `repeat` method is used to repeat the string "0" or "1" a certain number of times. This is a more concise way of writing the code than using a loop to print the characters.</s>
