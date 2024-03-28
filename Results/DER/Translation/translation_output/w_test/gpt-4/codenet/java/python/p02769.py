Below is the equivalent Python code for the Java code provided above. The code assumes the input follows the same format as the given Java code, where integers are read from standard input.

```python
import math
from sys import stdin

MOD = 1000000007

def modinv(x, p):
    return pow(x, p - 2, p)

class ERoaming:
    def gen(self, n):
        self.fact = [0] * (n + 1)
        self.factinv = [0] * (n + 1)
        self.fact[0] = 1
        self.factinv[0] = modinv(self.fact[0], MOD)
        for i in range(1, n + 1):
            self.fact[i] = i * self.fact[i - 1] % MOD
            self.factinv[i] = modinv(self.fact[i], MOD)

    def solve(self, n, k):
        if k >= n:
            return self.nCrs(2 * n - 1, n - 1, MOD)
        else:
            ans = 0
            self.gen(n)
            for i in range(k + 1):
                up = self.fact[n] * self.fact[n - 1] % MOD
                den1 = self.factinv[i] * self.factinv[i] % MOD
                den2 = self.factinv[n - i] * self.factinv[n - i - 1] % MOD
                den = den1 * den2 % MOD
                ans = (ans + up * den) % MOD
            return ans

    def nCrs(self, n, r, p):
        up = 1
        down = 1
        for i in range(r + 1, n + 1):
            up = up * i % p
        for i in range(1, r + 1):
            down = down * i % p
        return up * modinv(down, p) % p


def main():
    inputs = stdin.readline().strip().split()
    n = int(inputs[0])
    k = int(inputs[1])
    solver = ERoaming()
    print(solver.solve(n, k))


if __name__ == "__main__":
    main()
```

To run this Python code and pass in the test input, you can use an input redirection for a file that contains "3 2". For example, if the input is in a file named `input.txt`, you can run the Python script using:
```bash
python script.py < input.txt
```
This will display the expected output, which is:
```
10
```
Please note that to mimic the controlled environments where competitive programming solutions are judged, the provided Python solution reads from standard input and expects the values to be provided in the same way the Java code does. In a real-world scenario, you'd likely get the input values through other means, such as user input or as arguments to a function.
