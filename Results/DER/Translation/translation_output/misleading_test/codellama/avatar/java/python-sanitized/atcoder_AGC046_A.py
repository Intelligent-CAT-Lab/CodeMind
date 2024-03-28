import sys

def main():
    try:
        i = int(sys.stdin.readline().strip())
        if 1 <= i <= 179:
            j = 1
            while (i * j) % 360 != 0:
                j += 1
            print(j)
        else:
            print("Invalid input")
    except ValueError:
        print("Invalid input")

if __name__ == "__main__":
    main()