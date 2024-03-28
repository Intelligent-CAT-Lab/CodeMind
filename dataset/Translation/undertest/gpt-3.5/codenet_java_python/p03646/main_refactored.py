class main:
    import sys
    
    def solve():
        K = int(next())
        N = 50
        list_nums = [K // N + i for i in range(N)]
        
        for i in range(K % N):
            list_nums[i % N] += N + 1
            for j in range(N):
                list_nums[j] -= 1
        
        print(N)
        output = [str(num) for num in list_nums]
        print(' '.join(output))
    
    if __name__ == "__main__":
        solve()
        sys.stdout.flush()