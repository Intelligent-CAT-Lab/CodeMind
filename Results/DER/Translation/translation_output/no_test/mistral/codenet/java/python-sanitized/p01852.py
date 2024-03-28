import sys

def p01852():
    n = int(input())
    count = 0
    if n > 0:
        while n >= 2:
            n = n // 2
            count += 1
        count += 1
    print(count)

if __name__ == "__main__":
    p01852()