class main:
    left, right = map(int, input().split())
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")