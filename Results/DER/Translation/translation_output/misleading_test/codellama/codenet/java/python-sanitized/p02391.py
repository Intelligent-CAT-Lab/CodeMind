import sys

# Read the input from stdin
input_str = sys.stdin.readline()

# Split the input into two integers
x, y = map(int, input_str.split())

# Compare the two integers and print the result
if x == y:
    print("a == b")
elif x < y:
    print("a < b")
else:
    print("a > b")