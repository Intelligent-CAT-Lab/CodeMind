解析


import java.io.IOException;
import java.util.Scanner;

class p00509:

    def run(self):
        scanner = Scanner(System.in)
        n = scanner.nextInt()
        c = scanner.nextInt()
        num = [0] * n
        if c < 0:
            if n == 1:
                print(11)
            else:
                for i in range(n * 2):
                    print(9)
                print()
        else:
            a = 1
            for i in range(n):
                a *= 10
            b = a // 10
            a -= 1
            for i in range(a, b, -1):
                if check(i, c):
                    return

    def check(self, i, c):
        builder = StringBuilder(str(i))
        builder2 = StringBuilder(str(i)).reverse()
        builder.append(c).append(builder2)
        if prime(int(builder.toString())):
            print(builder)
            return True
        else:
            return False

    def prime(self, b):
        for i in range(2, int(b ** 0.5) + 1):
            if b % i == 0:
                return False
        return True