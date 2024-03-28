class main:
    import java.io.*;
    import java.util.*;
    
    class p02470:
        def __init__(self):
            self.sc = Scanner(System.in)
            self.pr = Printer(System.out)
    
        def solve(self):
            n = self.sc.nextInt()
    
            self.pr.println(Euler.totient(n))
    
        class Euler:
            def __init__(self, n):
                self.phi = [i for i in range(1, n+1)]
    
                for i in range(2, n+1):
                    if self.phi[i-1] == i:
                        for j in range(i, n+1, i):
                            self.phi