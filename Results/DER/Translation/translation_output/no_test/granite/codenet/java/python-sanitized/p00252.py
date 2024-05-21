import sys

a = [int(x) for x in sys.stdin.read().split()]

if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")