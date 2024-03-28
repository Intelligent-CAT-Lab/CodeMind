class main:
    def p03328():
        a, b = map(int, input().split())
        n = b - a
        print(n * (n + 1) // 2 - b)
    
    p03328()