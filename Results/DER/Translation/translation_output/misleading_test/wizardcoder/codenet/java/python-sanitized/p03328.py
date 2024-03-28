import java.util.Scanner;

class p03328:
    def main(self):
        scanner = Scanner(System.in)
        a = scanner.nextInt()
        b = scanner.nextInt()
        n = b - a
        print(n * (n + 1) // 2 - b)

p03328().main()