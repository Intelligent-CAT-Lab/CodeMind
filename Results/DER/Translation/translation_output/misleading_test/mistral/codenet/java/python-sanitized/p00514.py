import sys

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if a*b > c:
        print(0)
        sys.exit(0)
    c -= a*b
    d = c + a - 1
    bi = 1
    for i in range(c):
        bi = bi * (d - i)
        bi = bi / (i + 1)
    print(bi)

if __name__ == "__main__":
    main()