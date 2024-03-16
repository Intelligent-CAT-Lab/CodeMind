import sys

left = int(sys.stdin.readline()) + int(sys.stdin.readline())
right = int(sys.stdin.readline()) + int(sys.stdin.readline())

if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")