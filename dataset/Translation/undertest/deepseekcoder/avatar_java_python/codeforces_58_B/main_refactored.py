class main:
    def codeforces_58_B(n):
        print(n)
        m = n
        for i in range(n - 1, 0, -1):
            if m % i == 0:
                print(i)
                m = i
    
    # Test input
    n = 733035
    codeforces_58_B(n)