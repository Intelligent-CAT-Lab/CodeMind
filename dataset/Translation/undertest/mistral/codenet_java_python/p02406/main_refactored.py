class main:
    import sys
    
    def p02406():
        n = int(input())
        result = []
        for i in range(n):
            if n % 3 == 0:
                result.append(n)
            else:
                while n % 10 != 3:
                    n //= 10
                result.append(n)
        print(' '.join(map(str, result)))
    
    if __name__ == '__main__':
        p02406()