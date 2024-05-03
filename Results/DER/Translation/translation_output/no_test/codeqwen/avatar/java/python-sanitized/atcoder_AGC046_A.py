import sys

if __name__ == "__main__":
    k = 360
    j = 1

    try:
        i = int(input())
    except ValueError:
        sys.stderr.write("Input is not an integer.\n")
        sys.exit(1)

    if 1 <= i <= 179:
        while not ((i * j) % k == 0):
            j += 1
        print(j)
    else:
        print("The input is out of range. It should be between 1 and 179.")