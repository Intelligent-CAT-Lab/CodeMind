import itertools
from fractions import Fraction

def solve(N):
    for h, n in itertools.product(range(1, 3501), repeat=2):
        # In the original Java code, the condition checks if (4*h*n-N*n-N*h) is not zero
        # to avoid division by zero, and if the fractional part of (N*h*n)/(4*h*n-N*n-N*h)
        # is zero (which implies that (N*h*n) is perfectly divisible by (4*h*n-N*n-N*h)).
        #