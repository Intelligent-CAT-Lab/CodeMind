<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 1000;
        for (int i = 0; i < S.length() - 2; i++) {
            int X = Integer.parseInt(S.substring(i, i + 3));
            min = Math.min(min, Math.abs(X - 753));
        }
        System.out.println(min);
        sc.close();
    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    S = input("Enter a string: ")
    min_diff = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i+3])
        min_diff = min(min_diff, abs(X - 753))
    print(min_diff)

if __name__ == "__main__":
    main()
```
This is a Python implementation of the Java code you provided. It uses the `input()` function to get a string from the user, and then it iterates over the string using a for loop, converting each substring of length 3 to an integer using `int()`. The `abs()` function is used to get the absolute value of the difference between each integer and 753, and the `min()` function is used to find the minimum of these differences. Finally, the minimum difference is printed to the console.</s>
