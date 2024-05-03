left = int(input()) + int(input())
right = int(input()) + int(input())

if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")