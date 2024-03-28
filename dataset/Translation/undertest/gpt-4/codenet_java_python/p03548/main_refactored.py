class main:
    # Importing necessary libraries for IO
    import sys
    import math
    
    class FastScanner:
        def __init__(self):
            self.reader = sys.stdin
    
        def next(self):
            return self.reader.readline().strip()
    
        def next_int(self):
            return int(self.next())
    
        def next_long(self):
            return long(self.next())
    
    # Solver class corresponding to Solver class in Java
    class Solver:
        def __init__(self):
            self.sc = FastScanner()
            
        def solve(self):
            x = self.sc.next_int()
            y = self.sc.next_int()
            z = self.sc.next_int()
            result = (x - z) // (y + z)
            print(result)
    
        def exit(self):
            sys.exit(0)
    
    if __name__ == "__main__":
        solver = Solver()
        solver.solve()
        solver.exit()