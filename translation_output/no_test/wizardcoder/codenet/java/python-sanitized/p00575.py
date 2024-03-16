import java.util.Scanner;

class p00575:
    def main(av):
        sc = Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()
        i = 0
        cnt = 0
        while cnt < c:
            i += 1
            cnt += a
            if i % 7 == 0:
                cnt += b
        System.out.println(i)

p00575().main(None)