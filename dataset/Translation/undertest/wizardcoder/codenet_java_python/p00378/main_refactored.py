class main:
    import java.util.*;
    
    class p00378:
        def solve(self):
            sc = Scanner(System.in)
            A = sc.nextInt()
            B = sc.nextInt()
            X = sc.nextInt()
    
            if X % 500!= 0:
                X += 500 - X % 500
    
            a = 0
            b = 0
    
            if A < B:
                a = X // 1000 + (X % 1000 > 0)
            elif A > 2 * B:
                b = X // 500
            else:
                a = X // 1000
                X %= 1000
                b = X // 500
    
            print(A * a + B * b)
    
        def main(self):
            self.solve()
    
    p00378().main()