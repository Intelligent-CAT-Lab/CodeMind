import sys

a, b, c = map(int, sys.stdin.readline().split())

result = "No"
if a <= c and c <= b:
    result = "Yes"

print(result)