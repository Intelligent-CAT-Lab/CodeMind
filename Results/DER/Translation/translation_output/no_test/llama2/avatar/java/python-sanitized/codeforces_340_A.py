import java.util
import java.io

class codeforces_340_A:
    def main(self, args):
        br = java.io.BufferedReader(java.io.InputStreamReader(java.lang.System.in))
        pw = java.io.PrintWriter(java.io.BufferedOutputStream(java.lang.System.out))

        z = br.readline().split()
        x = int(z[0])
        y = int(z[1])
        a = int(z[2])
        b = int(z[3])

        c = 0
        i, j
        lcm = x * y / gcd(x, y)

        for i in range(a, b + 1):
            if i % lcm == 0:
                break

        for j in range(b, a, -1):
            if j % lcm == 0:
                break

        if j % lcm == 0 and i % lcm == 0:
            c = (j - i) / lcm + 1

        pw.println(c)
        pw.close()

    def gcd(self, a, b):
        temp = a
        if a < b:
            a, b = b, a

        if a % b == 0:
            return b
        else:
            return self.gcd(b, a % b)

if __name__ == '__main__':
    codeforces_340_A().main(sys.argv)