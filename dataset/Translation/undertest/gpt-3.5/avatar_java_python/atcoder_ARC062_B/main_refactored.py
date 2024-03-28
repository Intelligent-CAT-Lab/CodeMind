class main:
    def atcoder_ARC062_B():
        input_str = input().strip()
        result = 0
        p = 0
        g = 1
    
        for i in range(1, len(input_str)):
            if input_str[i] == 'g':
                if p + 1 <= g:
                    result += 1
                    p += 1
                else:
                    g += 1
            else:
                if p + 1 <= g:
                    p += 1
                else:
                    g += 1
                    result -= 1
    
        print(result)
    
    atcoder_ARC062_B()