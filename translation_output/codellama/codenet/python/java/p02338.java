<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#!/usr/bin/env python3
# -*- coding: utf-8 -*-



def main():
    N, K = map(int, input().split())
    print(1 if N <= K else 0)

if __name__ == "__main__": main()



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(N <= K ? 1 : 0);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the input. The `System.out.println()` method is used to print the result to the console.</s>
