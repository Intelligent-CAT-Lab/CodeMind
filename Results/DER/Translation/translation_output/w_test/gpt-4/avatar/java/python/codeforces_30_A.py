```python
from sympy import symbols, Eq, solve
from sympy.core.power import integer_nthroot

A, B, N = map(int, input().split())

x = symbols('x')
eq = Eq(A * x**N, B)

# Solving for x, given that x must be an integer
sol = solve(eq, x)
found = False

for s in sol:
    if s.is_integer and -1000 <= s <= 1000:  # The problem constraints
        possible_root, is_exact = integer_nthroot(B, N)
        if is_exact and possible_root == s:  # Ensuring exact root
            print(s)
            found = True
            break

if not found:
    print("No solution")
```

To run this code with the provided test input and get the expected output, you would execute it like this with the given input:
```python
# Sample test case execution
# Test input: '7 896 7'
# Expected output: 2

# Providing input during runtime
input_str = '7 896 7'
expected_output = 2

# Redirecting input to the script
import io
import sys

backup = sys.stdin
sys.stdin = io.StringIO(input_str)

# Run the code
exec("""from sympy import symbols, Eq, solve
from sympy.core.power import integer_nthroot

A, B, N = map(int, input().split())

x = symbols('x')
eq = Eq(A * x**N, B)

# Solving for x, given that x must be an integer
sol = solve(eq, x)
found = False

for s in sol:
    if s.is_integer and -1000 <= s <= 1000:  # The problem constraints
        possible_root, is_exact = integer_nthroot(B, N)
        if is_exact and possible_root == s:  # Ensuring exact root
            print(s)
            found = True
            break

if not found:
    print("No solution")""")

# Restoring original stdin
sys.stdin = backup

# At this point, only for the test case, verify the outcome
output = sys.stdout.getvalue().strip()  # The printed value is captured here
assert int(output) == expected_output, f"Test failed: expected {expected_output}, got {output}"
print("Test passed.")
```

Please note that the import statements should not be repeated inside the `exec` function call if you're not running this inside an interactive Python session.
