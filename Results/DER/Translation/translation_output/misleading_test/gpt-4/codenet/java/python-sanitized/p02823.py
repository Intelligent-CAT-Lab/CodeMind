import sys
from functools import reduce

class p02823:
    def solve(self, input_str):
        n, a, b = map(int, input_str.split())
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            print(min(ans1, ans2))
        else:
            print((b - a) // 2)

# Test input
input_str = "5 2 4"
# Create an instance and solve the problem with the input
p02823().solve(input_str)