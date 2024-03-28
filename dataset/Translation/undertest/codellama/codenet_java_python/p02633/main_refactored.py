class main:
    import sys
    
    class Hayami:
        def __init__(self):
            self.hayami = sys.stdin.readline().strip()
            self.hayami_len = len(self.hayami)
            self.hayami_idx = 0
    
        def next_hayami(self):
            if self.hayami_idx >= self.hayami_len:
                return None
            hayami = self.hayami[self.hayami_idx]
            self.hayami_idx += 1
            return hayami
    
        def next_int(self):
            hayami = self.next_hayami()
            if hayami is None:
                return None
            return int(hayami)
    
        def next_long(self):
            hayami = self.next_hayami()
            if hayami is None:
                return None
            return long(hayami)
    
        def next_double(self):
            hayami = self.next_hayami()
            if hayami is None:
                return None
            return float(hayami)
    
        def close(self):
            sys.stdin.close()
    
    def main():
        hayami = Hayami()
        n = hayami.next_int()
        hayami.close()
        i = 1
        while True:
            if i * n % 360 == 0:
                print(i)
                return
            i += 1
    
    if __name__ == "__main__":
        main()