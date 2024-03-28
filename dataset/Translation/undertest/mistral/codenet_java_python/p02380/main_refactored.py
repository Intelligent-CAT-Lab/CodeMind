class main:
    import math
    
    def run(in, out):
        sc = input(in)
        a, b, cc = map(float, sc.split())
        cc = math.radians(cc)
    
        s = a * b * math.sin(cc) / 2
        l = a + b + math.sqrt(a * a + b * b - 2 * a * b * math.cos(cc))
        h = b * math.sin(cc)
    
        print(s)
        print(l)
        print(h)
    
    if __name__ == '__main__':
        run(input(), output())