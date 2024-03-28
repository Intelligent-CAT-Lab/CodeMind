# Python code

# importing the in-built module for taking input
import sys

def main():
    # taking input from the user
    n = int(sys.stdin.readline())

    # initializing the sum
    sum = 0

    # looping from 1 to n
    for i in range(1, n+1):
        # adding the current number to the sum
        sum = sum + i

    # printing the sum
    print(sum)

# calling the main function
if __name__ == "__main__":
    main()