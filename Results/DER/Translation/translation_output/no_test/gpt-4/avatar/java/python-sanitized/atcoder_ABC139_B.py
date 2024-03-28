# Importing sys to read the input from the stdin
import sys

# Reading two integers from the stdin and assigning them
a, b = map(int, sys.stdin.readline().split())
kuti = 1
tap = 0

# Loop to find out the required number of taps
while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

# Printing the result to stdout
print(tap)