import sys

def solve():
    input = sys.stdin.readline
    I, O, T, J, L, S, Z = list(map(int, input().split()))
    Ans = O
    six = min([I, J, L])
    Ans += 3 * six
    I -= six
    J -= six
    L -= six
    Ans += 2 * (I // 2 + J // 2 + L // 2)
    rem = I % 2 + J % 2 + L % 2
    if six > 0 and rem == 2: Ans += 1
    print(Ans)
    
    return 0

if __name__ == "__main__":
    solve()