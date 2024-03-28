import sys

def permutation(q, ans):
    # Base Case
    if len(q) <= 1:
        if ans:
            ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if not ans:
                permutation(q[:i] + q[i+1:], ans + q[i])
            else:
                permutation(q[:i] + q[i+1:], ans + " " + q[i])

if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    str = ""
    for i in range(1, n+1):
        str += str(i)
    permutation(str, "")