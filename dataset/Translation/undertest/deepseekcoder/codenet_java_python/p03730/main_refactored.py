class main:
    def p03730():
        a, b, c = map(int, input().split())
    
        for i in range(5000):
            if a * i % b == c:
                print("YES")
                return
        print("NO")
    
    p03730()