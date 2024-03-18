import sys

# Read lines from standard input
for line in sys.stdin:
    # Split the line into two parts and convert them to integers
    a, b = map(int, line.split())
    # Print the remainder of a divided by b
    print(a % b)