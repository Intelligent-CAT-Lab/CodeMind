def solve():
    K = int(input())
    N = 50
    list_nums = [0] * N
    
    for i in range(N):
        list_nums[i] = K // N + i
    
    for i in range(K % N):
        list_nums[i % N] += N + 1
        for j in range(N):
            list_nums[j] -= 1
    
    print(N)
    print(' '.join(map(str, list_nums)))
    print()

solve()