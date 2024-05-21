import sys

input = sys.stdin.readline().split(" ")
m = int(input[0])
f = int(input[1])
b = int(input[2])

if b > m + f:
    print("NA") 
elif b > m:
    print(b - m)
else:
    print("0")