class main:
    def to32(s):
        a = 32 - len(s)
        if a != 0:
            for i in range(a):
                s = '0' + s
        if a < 0:
            s = s[len(s)-32:]
        return s
    
    def main():
        x = int(input())
        twobit = format(x, '032b')
        left = format(x << 1, '032b')
        right = format(x >> 1, '032b')
        twobit = to32(twobit)
        left = to32(left)
        right = to32(right)
        print(twobit)
        print(''.join(['1' if bit == '0' else '0' for bit in twobit]))
        print(left)
        print(right)
    
    if __name__ == "__main__":
        main()