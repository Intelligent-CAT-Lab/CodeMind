def solve():
    K = next_long()
    N = 50
    lst = [K // N + i for i in range(N)]
    
    for i in range(K % N):
        lst[i % N] += N + 1
        lst = [x - 1 for x in lst]
    
    print(N)
    output = list(map(str, lst))
    print(' '.join(output))

def next_long():
    return int(input())

def main():
    solve()

if __name__ == "__main__":
    main()