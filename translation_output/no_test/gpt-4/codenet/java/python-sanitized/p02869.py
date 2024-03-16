# input and print functions for Python's FastScanner and PrintWriter analogue
def next_int():
    return int(input())

def print_array(arr):
    for each in arr:
        print(f"{each[0]} {each[1]} {each[2]}")

def solve():
    # 平均的に割り振る
    avg = K + K + N + N - 1
    abi = [[0, 0, 0] for _ in range(N)]
    for i in range(N):
        a = K + i
        b = avg - a
        abi[i][0] = a
        abi[i][1] = b
    
    # a+bが+1ずつされていくように加工する
    if N % 2 == 1:
        n = N
    else:
        n = N - 1
        abi[N - 1][2] = float('inf')
    
    if (n // 2) % 2 == 0:
        eve = -(n // 2)  # for n=9, it would be -4
        eve_time = n // 2 + 1
        for i in range(eve_time):
            abi[i][2] = eve
            eve += 2
        odd = -(n // 2) + 1
        odd_time = n // 2
        for i in range(odd_time):
            abi[i + eve_time][2] = odd
            odd += 2
    else:
        eve = -(n // 2) + 1
        eve_time = n // 2
        for i in range(eve_time):
            abi[i][2] = eve
            eve += 2
        odd = -n // 2
        odd_time = n // 2 + 1
        for i in range(odd_time):
            abi[i + eve_time][2] = odd
            odd += 2
    
    abi.sort(key=lambda a: a[2])
    for i in range(n):
        abi[i][1] += abi[i][2]
    
    ans = [[0, 0, 0] for _ in range(N)]
    for i in range(N):
        c = K + N + N + i
        ans[i][0], ans[i][1], ans[i][2] = abi[i][0], abi[i][1], c
    
    for i in range(N):
        if ans[i][0] + ans[i][1] > ans[i][2]:
            return None
    return ans

# main function
if __name__ == "__main__":
    N = next_int()
    K = next_int()

    ans = solve()
    if ans is not None:
        print_array(ans)
    else:
        print(-1)