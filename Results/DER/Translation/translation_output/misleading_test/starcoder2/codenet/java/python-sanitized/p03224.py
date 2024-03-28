import sys

N = int(sys.stdin.readline())
l = 1
while l < N:
    N -= l
    l += 1
if N != l:
    print("No")
    sys.exit()
print("Yes")
print(l+1)