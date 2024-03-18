import sys
import math

# Fast input template
def get_ints(): 
    return map(int, sys.stdin.readline().strip().split())
def get_int(): 
    return int(sys.stdin.readline().strip())

class Solver:
    def read_int(self):
        return get_int()
    
    def read_ints(self, n):
        return [self.read_int() for _ in range(n)]
    
    def solve(self):
        x, y, z = get_ints()
        print((x - z) // (y + z))

def main():
    solver = Solver()
    solver.solve()

if __name__ == "__main__":
    main()