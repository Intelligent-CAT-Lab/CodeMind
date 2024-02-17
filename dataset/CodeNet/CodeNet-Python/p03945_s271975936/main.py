import sys

def solve():
    input = sys.stdin.readline
    S = input().strip("\n")
    turn = 0
    current = S[0]
    for i in range(1, len(S)):
        if S[i] != current:
            turn += 1
            current = S[i]
    print(turn)

    return 0

if __name__ == "__main__":
    solve()