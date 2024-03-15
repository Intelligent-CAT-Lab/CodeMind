import sys

def p01751():
    a = int(input())
    b = int(input())
    c = int(input())
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)

if __name__ == "__main__":
    p01751()