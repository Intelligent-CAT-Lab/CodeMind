import java.util.*;
import java.io.*;
import java.util.function.*;

class p02823:
    def __init__(self):
        self.in_ = java.util.Scanner(System.in)
        self.out_ = java.io.PrintWriter(System.out)
        self.mod = 1000000007
        self.inf = 0xfffffffffffffffL

    def solve(self):
        n = self.in_.nextLong()
        a = self.in_.nextLong()
        b = self.in_.nextLong()
        if a > b:
            a, b = b, a
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1
            if a > b:
                a, b = b, a
            ans2 = a - 1 + (b - a + 1) // 2
            self.out_.println(min(ans1, ans2))
        else:
            self.out_.println((b - a) // 2)

    def __del__(self):
        self.in_.close()
        self.out_.close()

if __name__ == '__main__':
    p = p02823()
    p.solve()
    p.out_.flush()