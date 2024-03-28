import java.util.Scanner

public class p03427:

    def main(args):
        scanner = Scanner(System.in)
        N = scanner.nextLong() + 1
        scanner.close()

        # æ¡æ°
        s = str(N)
        length = len(s)
        c = int(s[0])
        max = (c - 1) + 9 * (length - 1)

        print(max)