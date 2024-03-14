import sys

def p03861():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    x = int(sys.stdin.readline().strip())
    count = 0
    count = b//x - a//x
    if a % x == 0:
        count += 1
    print(count)

p03861()