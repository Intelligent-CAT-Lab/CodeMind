def solve(N, x):
    ans = [0] * (2*N-1)
    if N == 2:
        return [1, 2, 3]

    if x == 2:
        ans[N-2] = 2*N-1
        ans[N-1] = 2
        ans[N]   = 1
        ans[N+1] = 2*N-2
        elm = 3
        for index in range(2*N-1):
            if ans[index] == 0:
                ans[index] = elm
                elm += 1
    else:
        ans[N-2] = 1
        ans[N-1] = x
        ans[N]   = 2*N-1
        ans[N+1] = 2
        elm = 3
        for index in range(2*N-1):
            if elm == x:
                elm += 1
            if ans[index] == 0:
                ans[index] = elm
                elm += 1
    return ans

def main():
    N = int(input())
    x = int(input())

    if x == 1 or x == 2*N-1:
        print("No")
        return
    else:
        print("Yes")

    ans = solve(N, x)
    for i in range(len(ans)):
        print(ans[i])

if __name__ == "__main__":
    main()