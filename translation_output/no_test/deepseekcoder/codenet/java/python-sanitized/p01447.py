import sys

def p01447():
    n = int(sys.stdin.readline())
    count = 0

    while n > 1:
        n = (n + (0 if n % 3 == 0 else 3 - n % 3)) // 3
        count += 1

    print(count)

p01447()