<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0:
1: 0
2: 1
3: 0 1
4: 2
5: 0 2
6: 1 2
7: 0 1 2
8: 3
9: 0 3
10: 1 3
11: 0 1 3
12: 2 3
13: 0 2 3
14: 1 2 3
15: 0 1 2 3


```
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


```
[/INST]
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
This code uses a bitset to represent the subsets of a set of size `n`. The bitset is initialized to all zeros, and then each bit is set to 1 if the corresponding element is in the subset. The subsets are then printed in the format specified in the problem.

The `subset` method is not needed in this solution, as the bitset can be used directly to generate the subsets. The `run` method is also not needed, as the main method can be used to read the input and print the subsets.

The `Scanner` class is used to read the input from the user, and the `String` class is used to concatenate the elements of the subset. The `System.out.println` method is used to print the subsets.</s>
