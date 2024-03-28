class main:
    import sys
    
    class Solver:
        def run(self):
            input_str = sys.stdin.readline().strip()
            N, A, B = map(int, input_str.split())
            base = N // (A + B)
            mod = N % (A + B)
            if mod >= A:
                mod = A
            print(base * A + mod)
    
    if __name__ == '__main__':
        solver = Solver()
        solver.run()