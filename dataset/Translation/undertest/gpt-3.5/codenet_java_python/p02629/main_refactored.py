class main:
    def convert_to_base26(N):
        out = [''] * 11
    
        for i in range(11):
            N = N - 1
            x = N // 26
            y = N % 26
            out[i] = chr(ord('a') + y)
            if x == 0:
                break
            N = x
    
        result = ''
        for i in range(10, -1, -1):
            if out[i] != '':
                result += out[i]
    
        return result
    
    if __name__ == "__main__":
        N = int(input())
        print(convert_to_base26(N))