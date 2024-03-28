<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 10 2

Expected output:
68

```
import java.util.Scanner;

public class p02606 {

    public p02606() {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int d = scanner.nextInt();

        int Ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0)
                Ans++;
        }

        System.out.println(Ans);
    }

    public static void main(String[] args) {
        new p02606();
    }
}

```
[/INST]
```python
import sys

def main():
    L, R, d = map(int, sys.stdin.readline().split())
    count = 0
    for i in range(L, R+1):
        if i % d == 0:
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```
This code reads the input from stdin, which is the standard input stream, and splits it into three integers using the `split()` method. It then uses a for loop to iterate over the range of numbers from `L` to `R`, and checks if each number is divisible by `d`. If it is, it increments a counter variable `count`. Finally, it prints the value of `count` to the console.

Note that in Python, the `range()` function generates a sequence of numbers from `L` to `R`, and the `for` loop iterates over each number in the sequence. The `if` statement checks if the current number is divisible by `d`, and if it is, it increments the `count` variable.</s>
