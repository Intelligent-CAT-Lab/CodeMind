class p03264:
    def main(self):
        sc = FScanner()
        
        n = sc.read_int()
        
        o = 0
        e = 0
        
        for i in range(1, n+1):
            if i % 2 == 1:
                o += 1
            else:
                e += 1
        print(o * e)
    
    def solve(self):
        pass
    
    def disp(self, data):
        for i in data:
            print(i, end=" ")
        print()
    
    def disp_str(self, data):
        for i in data:
            print(i, end=" ")
        print()
    
class FScanner:
    def __init__(self):
        self.sc = input()
    
    def has_next_line(self):
        return True
    
    def read_int(self):
        return int(self.sc)
    
    def read_long(self):
        return int(self.sc)
    
    def read_int_l(self):
        return [int(i) for i in self.sc.split()]
    
    def read_string(self):
        return self.sc
    
    def read_string_l(self, dlm):
        return self.sc.split(dlm)

p = p03264()
p.main()