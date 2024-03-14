import sys
import re

def solve(S):
    while len(S) > 3:
        if 'ABC' not in S:
            return 'No'
        S = S.replace('ABC', 'X')
        check = [False] * 3
        for c in S:
            if ord(c) - ord('A') < 3:
                check[ord(c) - ord('A')] = True
        if check.count