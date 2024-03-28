import math
import sys

def solve():
    n = int(input())
    K = int(input())
    sins = [math.sin(2 * math.pi * i / n) / 2 for i in range(n