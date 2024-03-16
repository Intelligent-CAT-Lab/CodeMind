import java.util

class p03005:
    def main(self, args):
        ans = 0
        sc = java.util.Scanner(System.in)
        n = sc.nextInt()
        k = sc.nextInt()

        if k == 1:
            ans = 0
        else:
            ans = n - k

        print(ans)