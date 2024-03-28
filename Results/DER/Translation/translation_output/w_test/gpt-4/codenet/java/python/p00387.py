Below is the translated code from Java to Python:

```python
import math
import sys

class Methods:
    def print(self, *ar):
        print(ar)

    def max(self, *ar):
        return max(ar)

    def min(self, *ar):
        return min(ar)

    def gcd(self, a, b):
        while b:
            a, b = b, a % b
        return a

    def lcm(self, a, b):
        return a // self.gcd(a, b) * b
    
    def factorial(self, i):
        if i == 1:
            return 1
        else:
            return i * self.factorial(i - 1)
    
    def manhat(self, x1, y1, x2, y2):
        return abs(x1 - x2) + abs(y1 - y2)
    
    def euclid(self, x1, y1, x2, y2):
        return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)
    
    def isPrime(self, n):
        if n <= 1 or (n % 2 == 0 and n > 2):
            return False
        for i in range(3, int(math.sqrt(n)) + 1, 2):
            if n % i == 0:
                return False
        return True

def solve(a, b, ms):
    print(max(1, (b + a - 1) // a))

def main():
    ms = Methods()
    tokens = sys.stdin.readline().split()
    a = int(tokens[0])
    b = int(tokens[1])
    solve(a, b, ms)

if __name__ == "__main__":
    main()
```

Here's how you can use this code:

```bash
echo "3 5" | python3 script.py
```

Replace `script.py` with the filename where you save the Python code above. The script reads from standard input, so you can use `echo` to pass the test input to the script. Alternatively, you can run the Python program and type the input `3 5` directly into the terminal, followed by pressing Enter.
