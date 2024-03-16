import sys

def main():
    n = int(sys.stdin.readline())

    for i in range(2 ** n):
        temp = i
        print(i, end=":")
        for j in range(n):
            if temp % 2 == 1:
                print(" " + str(j), end="")
            temp //= 2
        print()

if __name__ == "__main__":
    main()