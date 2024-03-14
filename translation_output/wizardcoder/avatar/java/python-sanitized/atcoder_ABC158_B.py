import java.util.*;

class atcoder_ABC158_B:
    def main(self):
        solver = Solver()
        solver.run()

class Solver:
    def run(self):
        sc = Scanner(System.in)
        N = sc.nextLong()
        A = sc.nextLong()
        B = sc.nextLong()
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        print(base * A + mod)
        return