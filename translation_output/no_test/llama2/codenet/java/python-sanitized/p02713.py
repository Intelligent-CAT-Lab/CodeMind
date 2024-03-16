import java.util

class p02713:
    def main(self, args):
        N = int(input())
        result = 0
        a = 0

        for i in range(1, N+1):
            for j in range(1, N+1):
                a = gcd(i, j)
                for k in range(1, N+1):
                    result += gcd(a, k)

        print(result)

    def gcd(self, p, q):
        if p % q == 0:
            return q
        return self.gcd(q, p % q)

if __name__ == '__main__':
    p02713().main(sys.argv[1:])