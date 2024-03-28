class main:
    import sys
    
    def calculate_score(s1):
        won = 0
        lose = 0
        g = 0
        p = 0
    
        for i in range(len(s1)):
            if s1[i] == 'g':
                if p == g:
                    g += 1
                elif p < g:
                    p += 1
                    won += 1
            elif s1[i] == 'p':
                if p == g:
                    g += 1
                    lose += 1
                elif p < g:
                    p += 1
                else:
                    g += 1
                    lose += 1
    
        return won - lose
    
    s1 = sys.stdin.readline().strip()
    print(calculate_score(s1))