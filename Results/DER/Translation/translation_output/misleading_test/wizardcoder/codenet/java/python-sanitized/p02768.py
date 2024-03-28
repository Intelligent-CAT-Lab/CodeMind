import java.util.Scanner;

class p02768:
    m = 1000000007

    def pow(self, a, b):
        s = 1
        a2 = a
        while b > 0:
            if (b & 1)!= 0:
                s = s * a2 % self.m
            a2 = a2 * a2 % self.m
            b >>= 1
        return s

    def reverse(self, a):
        return self.pow(a, self.m - 2)

    def sub(self, n, a):
        if a > n // 2:
            a = n - a
        s1 = 1
        n2 = n - a
        for i in range(n, n2 - 1, -1):
            s1 = s1 * i % self.m
        s2 = 1
        for i in range(1, a + 1):
            s2 = s2 * i % self.m
        s3 = self.reverse(s2)
        return s1 * s3 % self.m

    def main(self):
        sc = Scanner(System.in)
        n = sc.nextInt()
        a = sc.nextInt()
        b = sc.nextInt()

        all = self.pow(2, n)

        answer = (all + 2 * self.m - self.sub(n, a) - self.sub(n, b) - 1) % self.m
        print(answer)

p02768().main()