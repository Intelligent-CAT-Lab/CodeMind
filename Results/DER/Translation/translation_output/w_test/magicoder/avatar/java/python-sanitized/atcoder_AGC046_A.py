import sys

def main():
    i = int(input())
    k = 360
    j = 1

    if not 1 <= i <= 179:
        print("Invalid input!")
        sys.exit(1)

    while (i * j) % k != 0:
        j += 1

    print(j)

if __name__ == "__main__":
    main()