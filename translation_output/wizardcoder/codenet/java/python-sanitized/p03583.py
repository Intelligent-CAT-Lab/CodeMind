import java.util.Scanner;

class p03583:
    def main(self):
        sc = Scanner(System.in)
        n = sc.nextLong()
        sc.close()
        # a
        for i in range(1, 3510):
            # b
            for j in range(1, 3510):
                si = n * i * j
                bo = 4 * i * j - n * j - n * i
                if bo <= 0:
                    continue
                if si % bo == 0:
                    print(i, j, si // bo)
                    return

p03583().main()