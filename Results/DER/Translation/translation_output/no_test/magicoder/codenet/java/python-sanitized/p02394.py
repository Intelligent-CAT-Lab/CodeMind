import sys

def main():
    # Read input
    work = sys.stdin.readline().split()

    W = int(work[0])
    H = int(work[1])
    x = int(work[2])
    y = int(work[3])
    r = int(work[4])

    # Check if the circle is inside the rectangle
    judge = "Yes" if (0 <= x-r and x+r <= W) and ((y-r) >= 0 and (y+r) <= H) else "No"

    # Print the result
    print(judge)

if __name__ == "__main__":
    main()