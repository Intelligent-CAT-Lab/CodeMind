import java.util

class p03671:
    def main(self, args):
        sc = java.util.Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()

        sum = [a, b, c]
        java.util.Arrays.sort(sum)

        print(sum[0] + sum[1])