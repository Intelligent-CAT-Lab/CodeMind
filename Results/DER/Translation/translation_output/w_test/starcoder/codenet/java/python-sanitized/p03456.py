import sys

def is_square(n):
    if n == 0 or n == 1:
        return True
    x = n // 2
    seen = set([x])
    while x * x!= n:
        x = (x + (n // x)) // 2
        if x in seen:
            return False
        seen.add(x)
    return True

def main():
    for line in sys.stdin:
        a, b = map(int, line.split())
        if is_square(a + b) and is_square(a - b):
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    main()