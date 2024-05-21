import sys

Sheep, Wolve = map(int, input().split())

if Wolve >= Sheep:
    print("unsafe")
else:
    print("safe")