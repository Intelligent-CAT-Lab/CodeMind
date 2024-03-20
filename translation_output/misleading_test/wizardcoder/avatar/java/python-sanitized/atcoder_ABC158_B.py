import java.util.*;

class atcoder_ABC158_B:
    def main(self):
        new Solver().run()

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
        System.out.println(base * A + mod)
        return