import sys

def p03778():
    w = int(input())
    a, b = map(int, input().split())
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    else:
        print(abs(a - b - w))

if __name__ == "__main__":
    p03778()