import sys

S = sys.stdin.readline().strip()
for i in range(3):
    S = S[:i] + '9' + S[i:]
print(S)