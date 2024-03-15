from math import factorial
import sys

# Calculate factorial of 1510 (fact に 1510 の階乗を代入)
fact = factorial(1510)

# Loop over each line of input until there's no more input
for line in sys.stdin:
    n = int(line.strip())   # Convert input line to integer n
    print(fact + 2)         # Output fact + 2

    # Output numbers from 2 to (fact + 2 + n - 1)
    for i in range(2, 2 + n):
        print(i)