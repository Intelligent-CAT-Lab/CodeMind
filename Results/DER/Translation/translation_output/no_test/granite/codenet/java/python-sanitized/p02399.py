import java.util.Scanner;

class p02399:

    def main(self):
        sc = Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        sc.close()
        d = a // b
        r = a % b
        f = "{:.5f}".format(1.0 * a / b)
        print(d, r, f)

p02399().main()