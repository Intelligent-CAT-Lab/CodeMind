class main:
    import sys
    
    class Scanner:
        def __init__(self):
            self.br = sys.stdin
    
        def next(self):
            return self.br.readline().strip()
    
        def next_array(self, length):
            return [self.next() for _ in range(length)]
    
        def next_double(self):
            return float(self.next())
    
        def next_double_array(self, length):
            return [self.next_double() for _ in range(length)]
    
        def next_int(self):
            return int(self.next())
    
        def next_int_array(self, length):
            return [self.next_int() for _ in range(length)]
    
        def next_long(self):
            return int(self.next())
    
        def next_long_array(self, length):
            return [self.next_long() for _ in range(length)]
    
        def ready(self):
            return self.br.ready()
    
    def calc(n, x):
        if n == 0:
            return 1
        sum = 0
        x -= 1
        length = length(n - 1)
        p = p(n - 1)
        if x > 0:
            if length <= x:
                sum += p
            else:
                sum += calc(n - 1, x)
            x -= length
        if x > 0:
            x -= 1
            sum += 1
        if x > 0:
            if length <= x:
                sum += p
            else:
                sum += calc(n - 1, x)
        return sum
    
    def length(n):
        return 1 + 4 * (2 ** n - 1)
    
    def p(n):
        return 1 + 2 * (2 ** n - 1)
    
    sc = Scanner()
    n = sc.next_int()
    x = sc.next_long()
    print(calc(n, x))