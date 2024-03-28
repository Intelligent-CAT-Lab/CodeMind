class main:
    import java.io.*;
    import java.util.*;
    
    class p03373:
        def __init__(self):
            self.sc = Scanner(System.in)
            self.pr = Printer(System.out)
    
        def solve(self):
            a = self.sc.nextInt()
            b = self.sc.nextInt()
            c = self.sc.nextInt()
            x = self.sc.nextInt()
            y = self.sc.nextInt()
    
            min = float('inf')
            for i in range(max(x, y) + 1):
                tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
                min = min(min, tmp)
    
            self.pr.println(min)
    
        def __del__(self):
            self.sc.close()
            self.pr.close()
    
    if __name__ == '__main__':
        obj = p03373()
        obj.solve()