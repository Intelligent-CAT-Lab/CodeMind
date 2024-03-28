class main:
    import sys
    
    def solve():
        LIMIT = 1000000000
        div = [1] * LIMIT
        for i in range(2, LIMIT):
            for j in range(i, LIMIT, i):
                div[j] += 1
    
        n = int(input())
        res = 0
        for i in range(1, n+1):
            res += i * div[i]
        print(res)
    
    def shuffle(a):
        n = len(a)
        for i in range(n):
            r = i + int(random.random() * (n - i))
            a[i], a[r] = a[r], a[i]
    
    def main():
        solve()
    
    if __name__ == "__main__":
        main()