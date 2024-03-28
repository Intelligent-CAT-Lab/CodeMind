<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
-49 1000000000008

```
import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}
```
[/INST]
```python
import sys

def main():
    A, B, K = map(int, sys.stdin.readline().split())
    n = A - K

    if A + B <= K:
        print("0 0")
    elif n < 0:
        print("0", A + B - K)
    else:
        print(n, B)

if __name__ == "__main__":
    main()
```
Note that in Python, we don't need to explicitly import the `java.util` package, as it is imported by default. Additionally, we use the `map` function to convert the input strings to integers, and the `split` method to split the input string into a list of strings. Finally, we use the `print` function to print the output, with the `if __name__ == "__main__":` block to ensure that the `main` function is only executed when the script is run directly, rather than when it is imported as a module.</s>
