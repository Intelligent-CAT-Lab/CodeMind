import java.util.*; 

class p03071:
    def main(self):
        sc = Scanner(System.in)
        A = sc.nextInt()
        B = sc.nextInt()
        c = 0
        
        for i in range(2):
            if A >= B:
                c += A
                A -= 1
            else:
                c += B
                B -= 1
        
        System.out.print(c)

p03071().main()


Output:

-70