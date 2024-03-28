<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
erow/

```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }
    }
}
```
Explanation:

* `import java.util.Scanner;` is used to import the `Scanner` class, which is used to read input from the user.
* `public class Solution {` is the beginning of the class definition.
* `public static void main(String[] args) {` is the beginning of the `main` method, which is the entry point of the program.
* `Scanner sc = new Scanner(System.in);` creates a new `Scanner` object that reads input from the user.
* `int x = sc.nextInt();` reads the first integer from the user input.
* `int y = sc.nextInt();` reads the second integer from the user input.
* `if (Math.abs(x - y) <= 1) {` checks if the absolute difference between `x` and `y` is less than or equal to 1.
* `System.out.println("Brown");` prints "Brown" if the condition is true.
* `else {` is the beginning of the else block.
* `System.out.println("Alice");` prints "Alice" if the condition is false.
* `}` is the end of the else block.
* `}` is the end of the `main` method.
* `}` is the end of the class definition.</s>
