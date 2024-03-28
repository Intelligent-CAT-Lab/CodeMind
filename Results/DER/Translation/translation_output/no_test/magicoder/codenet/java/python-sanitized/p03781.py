import sys

def main():
    x = int(sys.stdin.readline())
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    print(i)

if __name__ == "__main__":
    main()