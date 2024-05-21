import sys

left = sum(map(int, sys.stdin.readline().split()))
right = sum(map(int, sys.stdin.readline().split()))

if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")