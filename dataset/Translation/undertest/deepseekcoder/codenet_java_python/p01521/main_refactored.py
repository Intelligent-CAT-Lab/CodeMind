class main:
    def p01521(s):
        return 'x' if s[0] == 'x' and s[-1] == 'x' else 'o'
    
    print(p01521(input()))