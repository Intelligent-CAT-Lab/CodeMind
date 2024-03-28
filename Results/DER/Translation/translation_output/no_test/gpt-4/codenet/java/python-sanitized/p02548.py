# Import the sys module to read from standard input
import sys

def main():
    # Read the number from standard input
    n = int(sys.stdin.readline())
    cnt = 0

    # Use nested for loops to iterate through all pairs of numbers
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            if i * j < n:
                cnt += 1
            else:
                # If the product is not less than n, break out of the inner loop
                break

    # Print the result
    print(cnt)

# Run the main method if this script is executed
if __name__ == '__main__':
    main()