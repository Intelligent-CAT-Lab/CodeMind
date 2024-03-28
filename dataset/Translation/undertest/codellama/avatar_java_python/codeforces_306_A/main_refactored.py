class main:
    import math
    
    class FastReader:
        def __init__(self):
            self.br = open(0)
    
        def next(self):
            while True:
                line = self.br.readline()
                if line:
                    return line.strip()
    
        def next_int(self):
            return int(self.next())
    
        def next_long(self):
            return long(self.next())
    
        def next_double(self):
            return float(self.next())
    
        def int_array(self, size):
            return [self.next_int() for _ in range(size)]
    
        def char_array(self):
            return self.next().strip()
    
    class Pair:
        def __init__(self, x, y):
            self.x = x
            self.y = y
    
        def __lt__(self, other):
            return self.y < other.y
    
    def main():
        fr = FastReader()
        n = fr.next_double()
        m = fr.next_double()
        for i in range(int(m - (n % m))):
            print(int(n / m), end=' ')
        for i in range(int(m - (n % m)), int(m)):
            print(int(math.ceil(n / m)), end=' ')
    
    if __name__ == '__main__':
        main()