Here is the equivalent code in Python:

```python
import sys
from math import gcd, sqrt

# Utility functions
def max_pow(x, n, mo):
    sum = 1
    while n > 0:
        if (n & 1) == 1:
            sum = sum * x % mo
        x = x * x % mo
        n >>= 1
    return sum

def is_prime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    for i in range(3, int(sqrt(n)) + 1, 2):
        if n % i == 0:
            return False
    return True

def upper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

def lupper_division(a, b):
    return a // b if a % b == 0 else a // b + 1

mod = 1000000007
eps = 0.0000000001

# UnionFind class
class UnionFind:
    def __init__(self, n):
        self.parent = [-1] * n

    def root(self, A):
        if self.parent[A] < 0:
            return A
        self.parent[A] = self.root(self.parent[A])
        return self.parent[A]

    def size(self, A):
        return -self.parent[self.root(A)]

    def connect(self, A, B):
        A = self.root(A)
        B = self.root(B)
        if A == B:
            return False
        if self.size(A) < self.size(B):
            A, B = B, A  # SWAP
        self.parent[A] += self.parent[B]
        self.parent[B] = A
        return True

# Entry point of the program
if __name__ == "__main__":
    input_str = sys.stdin.readline().strip()
    for i in range(1, len(input_str)):
        if input_str[i - 1] == 'A' and input_str[i] == 'C':
            print("Yes")
            sys.exit()
    print("No")
```

When using this code snippet, you should run the Python code, and then enter the string (`BACD` in this case) followed by the 'Enter' button. The input is read from stdin, which means it waits for input from the user or another program that pipes input into it.

Please note: Some Java code, such as FastScanner, is not translated as Python has equivalent built-in functionality already (like reading input from stdin). The same applies to methods that are not used for the problem's solution. Also, the random, mod-related utilities, and sorting algorithms are not implemented in this snippet because they are not relevant to the problem solved by the main method, which is checking for the occurrence of "AC" in the input string.
