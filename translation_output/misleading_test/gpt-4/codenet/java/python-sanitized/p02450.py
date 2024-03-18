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

def main():
    n = int(input())
    str_ = "".join(str(i) for i in range(1, n + 1))
    permutation(str_, "")

if __name__ == "__main__":
    main()