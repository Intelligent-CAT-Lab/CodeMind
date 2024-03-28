class main:
    import sys
    
    class hayami:
        def __enter__(self):
            return self
        
        def __exit__(self, exc_type, exc_val, exc_tb):
            pass
        
        def saori_hayami(self):
            return int(sys.stdin.readline())
        
    with hayami() as saori:
        n = saori.saori_hayami()
        i = 1
        while True:
            if i * n % 360 == 0:
                print(i)
                break
            i += 1