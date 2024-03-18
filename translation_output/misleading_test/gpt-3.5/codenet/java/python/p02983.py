```python
import sys

class FastReader:
    def __init__(self):
        self.input_buffer = sys.stdin.read().split()
        self.current_index = 0

    def next(self):
        if self.current_index >= len(self.input_buffer):
            return None
        self.current_index += 1
        return self.input_buffer[self.current_index - 1]

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return sys.stdin.readline()

class Solution:
    def solve(self):
        sc = FastReader()

        L = sc.nextInt()
        R = sc.nextInt()

        R -= L
        L %= 2019
        R += L

        res = 2019  # max value

        if R - L > 2019:
            print(0)
            return

        for i in range(L, R+1):
            for j in range(L, i):
                res = min(res, (i*j) % 2019)

        print(res)

if __name__ == "__main__":
    ob = Solution()
    ob.solve()
```
```python

# Test input parsing
import io
import sys
sys.stdin = io.StringIO("2020 2040\n")

ob = Solution()
output_capture = io.StringIO()
sys.stdout = output_capture
ob.solve()
sys.stdout = sys.__stdout__

output = output_capture.getvalue().strip()
expected_output = "37"
assert output == expected_output, f"Expected: {expected_output}, Got: {output}"
print("Output matches expected output.")
```
