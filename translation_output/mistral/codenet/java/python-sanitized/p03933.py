import math

def solve():
    n = int(input())
    K = int(input())
    sins = [math.sin(2 * math.pi * i / n) / 2 for i in range(n + 1)]
    
    low = 0
    high = 2 * math.pi
    for rep in range(50):