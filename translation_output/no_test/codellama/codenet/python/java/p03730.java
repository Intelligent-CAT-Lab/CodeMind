<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a, b, c = list(map(int, input().split()))

def foo(a, b, c):
    seen = set()
    m = a % b
    i = m
    while i not in seen :
        if i == c:
            print("YES")
            return 
        seen.add(i)
        i = (m + i) % b
    print("NO")
foo(a, b, c)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Foo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        Set<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            if (i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```
Note that the `HashSet` class is used to keep track of the numbers that have been seen, and the `contains` method is used to check if a number is already in the set. The `nextInt` method is used to read the input from the user, and the `println` method is used to print the output.</s>
