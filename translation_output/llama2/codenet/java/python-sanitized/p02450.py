import sys

n = int(sys.stdin.readline())

def permutation(q, ans):
    if len(q) <= 1:
        if len(ans) != 0:
            print(ans + q)
    else:
        for i in range(len(q)):
            if len(ans) == 0:
                permutation(q[:i] + q[i + 1:], ans + q[i])
            else:
                permutation(q[:i] + q[i + 1:], ans + " " + q[i])

permutation("", "")