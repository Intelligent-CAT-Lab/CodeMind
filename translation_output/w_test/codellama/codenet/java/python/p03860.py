<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
ABC


```
import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        char upper = lines[1].charAt(0);
        System.out.println("A" + upper +"C");
    }
}
```
[/INST]
```
import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        char upper = lines[1].charAt(0);
        System.out.println("A" + upper +"C");
    }
}
```

Here's the Python code that translates the Java code:
```
import sys

lines = sys.stdin.readline().split()
upper = lines[1][0]
print("A" + upper + "C")
```
Note that the Python code uses `sys.stdin.readline()` to read a line from standard input, and `split()` to split the line into a list of words. The `upper` variable is assigned the first character of the second word in the list, and then the string "A" + `upper` + "C" is printed to standard output.</s>
