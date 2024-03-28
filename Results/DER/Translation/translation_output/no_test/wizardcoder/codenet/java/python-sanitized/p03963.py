import java.util.*;

class p03963:
    def main(self):
        sc = Scanner(System.in)
        N = sc.nextInt()
        K = sc.nextInt()
        ans = K
        for i in range(2, N+1):
            ans *= K-1
        print(ans)

p03963().main()