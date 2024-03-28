class main:
    def p03427(N):
        N = int(N) + 1
        s = str(N)
        length = len(s)
        c = int(s[0])
        max = (c - 1) + 9 * (length - 1)
        return max
    
    print(p03427(input()))