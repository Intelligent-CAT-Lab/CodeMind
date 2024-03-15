import sys

S = input()
S0 = '0'
S0mas = 0
for char in S:
    if char == S0:
        S0mas += 1
S1mas = len(S) - S0mas
if S0mas < S1mas:
    print(S0mas * 2)
else:
    print(S1mas * 2)