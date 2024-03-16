from itertools import permutations

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
                permutation(q[:i] + q[i + 1:], ans + q[i])
            else:
                permutation(q[:i] + q[i + 1:], ans + " " + q[i])

def main():
    n = int(input())
    str_seq = ""

    for i in range(1, n + 1):
        str_seq += str(i)

    permutation(str_seq, "")

if __name__ == "__main__":
    main()