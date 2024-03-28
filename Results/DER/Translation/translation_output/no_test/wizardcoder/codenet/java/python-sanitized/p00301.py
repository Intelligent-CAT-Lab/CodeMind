import java.util.Scanner;

class p00301:
    def main(self):
        sc = Scanner(System.in)
        n = sc.nextInt()
        a = [0] * 15
        i = 0
        while n > 0:
            a[i] = (n + 1) % 3 - 1
            n = (n - a[i]) // 3
            i += 1
        while i > 0:
            print((a[i - 1] == 0) and "0" or (a[i - 1] > 0) and "+" or "-", end="")
            i -= 1