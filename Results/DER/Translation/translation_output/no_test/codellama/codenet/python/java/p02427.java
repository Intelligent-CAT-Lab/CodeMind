<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

#!/usr/bin/env python3
# Bitset 2 - Enumeration of Subsets 1


def subset(n):
    for i in range(2**n):
        yield [v for v in range(n) if i & (1 << v) > 0]


def run():
    n = int(input())

    for i, vs in enumerate(subset(n)):
        print("{}:{}".format(i, "".join([" {}".format(v) for v in vs])))


if __name__ == '__main__':
    run()



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Bitset2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < (1 << n); i++) {
            String subset = "";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset += " " + j;
                }
            }
            System.out.println(i + ": " + subset);
        }
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read the input from the user, and it uses a `for` loop to iterate over the possible subsets of the input. The `subset` variable is used to store the current subset, and it is printed to the console at the end of each iteration.

Note that the `subset` variable is initialized to an empty string, and it is updated in the `for` loop to include the current element if it is part of the subset. The `System.out.println` statement is used to print the current subset to the console.</s>
