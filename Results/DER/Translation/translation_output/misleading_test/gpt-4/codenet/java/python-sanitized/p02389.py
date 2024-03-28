import sys

class Solution:
    def solve(self, a, b):
        return f"{a*b} {2*a+2*b}"

# Read input from stdin
input_str = input().strip()
a, b = map(int, input_str.split())

# Call the solver
solver = Solution()
output = solver.solve(a, b)

# Print the output to stdout
print(output)