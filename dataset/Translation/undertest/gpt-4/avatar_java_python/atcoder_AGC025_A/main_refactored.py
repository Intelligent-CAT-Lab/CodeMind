class main:
    def atcoder_AGC025_A():
        n = input()
    
        for i in range(1, len(n)):
            if n[i] != '0':
                sum_digits = sum(int(digit) for digit in n)
                print(sum_digits)
                return
    
        if n[0] == '1':
            print(10)
            return
    
        print(n[0])
    
    # Test input
    atcoder_AGC025_A()