class main:
    class Solver:
        def run(self):
            N, A, B = map(int, input().split())
            base = N // (A + B)
            mod = N % (A + B)
            if mod >= A:
                mod = A
            print(base * A + mod)
            return
    
    Solver().run()