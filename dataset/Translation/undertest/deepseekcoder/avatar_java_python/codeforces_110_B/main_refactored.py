class main:
    def codeforces_110_B(n):
        if n == 1:
            return 'a'
        elif n == 2:
            return 'ab'
        elif n == 3:
            return 'abc'
        else:
            result = 'abcd' * (n // 4)
            t = n % 4
            if t == 1:
                result += 'a'
            elif t == 2:
                result += 'ab'
            elif t == 3:
                result += 'abc'
            return result
    
    print(codeforces_110_B(100))