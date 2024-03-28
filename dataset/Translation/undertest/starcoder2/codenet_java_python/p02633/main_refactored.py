class main:
    import sys
    
    def saori_hayami():
        hayami = sys.stdin.readline()
        hayami = hayami.strip()
        hayami = int(hayami)
        i = 1
        while True:
            if i*hayami % 360 == 0:
                print(i)
                return
            i += 1
    
    saori_hayami()