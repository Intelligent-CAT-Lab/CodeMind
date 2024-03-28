<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
c

Expected output:
]d

```
print ( chr ( ord ( input ( ) ) + 1 ) )


```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char d = (char) (c + 1);
        System.out.println(d);
    }
}
```
Explanation:

* `import java.util.Scanner;` imports the `Scanner` class from the `java.util` package, which is used to read input from the user.
* `public class Solution {` declares a class called `Solution`.
* `public static void main(String[] args) {` declares the `main` method, which is the entry point of the program.
* `Scanner sc = new Scanner(System.in);` creates a new `Scanner` object called `sc` that reads input from the user.
* `char c = sc.next().charAt(0);` reads a character from the user and stores it in the `c` variable.
* `char d = (char) (c + 1);` increments the value of `c` by 1 and stores the result in the `d` variable.
* `System.out.println(d);` prints the value of `d` to the console.
* `}` closes the `main` method.
* `}` closes the `Solution` class.</s>
