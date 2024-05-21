import sys
from math import factorial

fact = factorial(1510) + 2

for line in sys.stdin:
    n = int(line)
    print(fact)
    for i in range(2, n + 2):
        print(i)