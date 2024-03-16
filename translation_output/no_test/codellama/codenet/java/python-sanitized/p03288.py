import sys

r = int(sys.stdin.readline())

if r < 1200:
    print("ABC")
elif r < 2800:
    print("ARC")
else:
    print("AGC")