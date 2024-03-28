import sys

input_str = sys.stdin.readline().strip()

if len(input_str) == len(set(input_str)):
    print("yes")
else:
    print("no")