import sys

input_string = sys.stdin.readline().strip()

if len(input_string) == len(set(input_string)):
    print("yes")
else:
    print("no")