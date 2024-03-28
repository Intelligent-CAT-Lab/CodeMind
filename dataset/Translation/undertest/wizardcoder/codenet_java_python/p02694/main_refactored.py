class main:
    import java.util.Scanner;
    
    class p02694:
    
        def main(self):
            stdIn = Scanner(System.in)
    
            x = stdIn.nextLong()
            count = 0
    
            a = 100
            while True:
                if a >= x:
                    break
                a = a + a/100
                count += 1
    
            System.out.println(count)
    
    p02694().main()