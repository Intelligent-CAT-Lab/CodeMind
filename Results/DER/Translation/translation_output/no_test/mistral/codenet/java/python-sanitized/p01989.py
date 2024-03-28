import sys

def solve(in, out, ms):
    s = in.readline().strip()
    length = len(s)
    ans = 0
    for i in range(1, length-2):
        for j in range(i+1, length-1):
            for k in range(j+1, length):
                a = s[:i] + s[j:k] + s[k:]
                for x in range(4):
                    if len(a[x])