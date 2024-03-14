import java.util.Scanner;

class p03011:
    def main(self):
        sc = Scanner(System.in)
        P = sc.nextInt()
        Q = sc.nextInt()
        R = sc.nextInt()

        if P >= Q:
            if P >= R:
                max = Q + R
            else:
                max = P + Q
        elif Q >= R:
            if Q >= P:
                max = P + R
            else:
                max = Q + R
        elif R >= P:
            if R >= Q:
                max = P + Q
            else:
                max = P + R

        System.out.println(max)

p03011().main()