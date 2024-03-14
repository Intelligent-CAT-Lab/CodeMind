import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    n = int(sys.stdin.readline())
    k = 0
    for i in range(1, n // a + 1):
        k += b
    print(k)

if __name__ == "__main__":
    main()