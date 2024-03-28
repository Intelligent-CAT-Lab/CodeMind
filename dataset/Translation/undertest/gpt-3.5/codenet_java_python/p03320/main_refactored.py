class main:
    import sys
    
    class P:
        def __init__(self, x, d):
            self.x = x
            self.d = d
    
    def main():
        n = int(input().strip())
        lis = []
        a = 9
        b = 10
    
        for i in range(1, 10):
            lis.append(P(i, -11 + i))
            
        lis.append(P(19, -1))
        
        for i in range(1, 15):
            for w in range(1, 1000):
                x, y = w * b + a, 0
                tmp_x = x
                e = 0
                while tmp_x > 0:
                    e += tmp_x % 10
                    tmp_x //= 10
                y = (double)x / e
                lis.append(P(y, (double)y / e))
            b *= 10
            a *= 10
            a += 9
        
        lis.sort(key=lambda p: p.x)
        max_val = 0
        for p in lis:
            if max_val < p.x:
                max_val = p.x
                print(max_val)
                n -= 1
                if n == 0:
                    break
    
    if __name__ == "__main__":
        main()