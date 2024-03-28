import sys

S = sys.stdin.readline().strip()
S = list(S)
S[0] = '9' if S[0] == '1' else '1'
S[1] = '9' if S[1] == '1' else '1'
S[2] = '9' if S[2] == '1' else '1'
print(''.join(S))