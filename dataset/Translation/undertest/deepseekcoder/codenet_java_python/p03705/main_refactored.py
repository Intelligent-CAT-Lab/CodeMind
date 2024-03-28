class main:
    def p03705():
        n, a, b = map(int, input().split())
    
        if a > b or (n == 1 and a != b):
            return 0
        if a == b:
            return 1
    
        return (n - 2) * (b - a) + 1
    
    print(p03705())