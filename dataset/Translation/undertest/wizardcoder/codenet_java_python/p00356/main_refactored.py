class main:
    import java.util.Scanner;
    
    class p00356:
    
        def main(self):
            scan = Scanner(System.in)
            x = scan.nextInt()
            y = scan.nextInt()
            p = 0
            a = x
            b = y
            while x % y!= 0:
                z = x
                x = y
                y = z % y
            m = a + b - y
    
            if a % 2 == 0 or b % 2 == 0 or a == b or (a % 2 > 0 and b % 2 > 0):
                print(m + 1)
            else:
                print(m)
    
    p00356().main()