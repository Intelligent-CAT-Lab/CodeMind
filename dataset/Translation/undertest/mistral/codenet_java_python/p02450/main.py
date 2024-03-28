n = int(input())
str = ""

for i in range(1, n+1):
    str += str(i)

permutation(str, "")

def permutation(q, ans):
    # Base Case
    if len(q) <= 1:
        if len(ans) != 0:
            ans += " "
        print(ans + q)
    # General Case
    else:
        for i in range(len(q)):
            if len(ans) == 0:
                permutation(q[:i] + q[i+1:], ans + q[i])
            else:
                permutation(q[:i] + q[i+1:], ans + " " + q[i])