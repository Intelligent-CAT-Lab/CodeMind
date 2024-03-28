MOD = 1000000007

def main():
    n, m = map(int, input().split())
    dp = {(1, 0): 1}
    for _ in range(m):
        next = {(a % (n+1), b): (next.get((a+1, 0), 0) + dp.get((a, b), 0) * a) % MOD 
                for a in range(n+1) for b in range(n+1)}
        next = {(a, (b+1) % (n+1)): (next.get((a, b+1), 0) + dp.get((a, b), 0) * (n-a-b)) % MOD 
                for a in range(n+1) for b in range(n+1)}
        next = {(a, b): (next.get((a, b), 0) + dp.get((a, b), 0) * b) % MOD 
                for a in range(n+1) for b in range(n+1)}
        dp = next
    print(dp.get((n, 0), 0))

if __name__ == "__main__":
    main()