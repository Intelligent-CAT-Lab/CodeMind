class main:
    from math import pi
    
    class Solver:
        def solve(self, r):
            pi = pi
            return 2 * pi * r
    
    def main():
        solver = Solver()
        t = 1  # Number of test cases
        while t != 0:
            r = float(input())
            result = solver.solve(r)
            print('%.20f' % result)
            t -= 1
    
    if __name__ == '__main__':
        main()