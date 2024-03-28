class main:
    import java.util.Scanner;
    
    class p02600:
        def main(self):
            sc = Scanner(System.in)
            x = sc.nextInt()
            k = 0
            if 400 <= x and x < 600:
                k = 8
            elif 600 <= x and x < 800:
                k = 7
            elif 800 <= x and x < 1000:
                k = 6
            elif 1000 <= x and x < 1200:
                k = 5
            elif 1200 <= x and x < 1400:
                k = 4
            elif 1400 <= x and x < 1600:
                k = 3
            elif 1600 <= x and x < 1800:
                k = 2
            elif 1800 <= x and x <= 1999:
                k = 1
            print(k)
    
    p02600().main()