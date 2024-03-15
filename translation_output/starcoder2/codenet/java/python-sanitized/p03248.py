import sys

n = int(input())
s = input()

if s[0] == '0' or s[-1] == '1':
    print(-1)
    sys.exit()

for i in range(n//2):
    if s[i] != s[-i-1]:
        print(-1)
        sys.exit()

print(1, 2)

for i in range(3, n+1):
    print(i-1, i)
    if s[i-2] == '1':
        print(i, i+1)