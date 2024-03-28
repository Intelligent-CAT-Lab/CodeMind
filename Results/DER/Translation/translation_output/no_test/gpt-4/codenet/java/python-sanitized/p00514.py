import math

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if a * b > c:
        print(0)
        return
    c -= a * b
    d = c + a - 1
    bi = 1
    for i in range(c):
        bi *= d - i
        bi //= i + 1
    print(bi)

if __name__ == "__main__":
    main()