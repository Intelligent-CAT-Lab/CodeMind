import sys

def main():
    k = 360
    j = 1

    try:
        i = int(input())
    except ValueError:
        print("Invalid input")
        sys.exit(1)

    if 1 <= i <= 179:
        while (i * j) % k != 0:
            j += 1
        print(j)
    else:
        print("Invalid input. Please enter a number between 1 and 179.")

if __name__ == "__main__":
    main()