class main:
    import sys
    
    def atcoder_ABC169_C():
        a = int(sys.stdin.readline().split()[0])
        b = float(sys.stdin.readline().split()[0])
        c = round(b * 100)
        d = a * c
        print(d // 100)
    
    atcoder_ABC169_C()