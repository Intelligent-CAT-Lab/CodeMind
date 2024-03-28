class main:
    def p03345():
        a, b, c, k = map(int, input().split())
        ans = a - b
        if abs(ans) > pow(10, 18):
            return "Unfair"
        if k % 2 == 0:
            return ans
        else:
            return ans * -1
    
    print(p03345())