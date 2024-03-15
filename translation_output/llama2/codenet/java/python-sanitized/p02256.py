import java.io

class p02256:
    def main(self, args):
        br = java.io.BufferedReader(java.io.InputStreamReader(java.lang.System.in))
        input = br.readline().split()
        a = int(input[0])
        b = int(input[1])

        print(GCD(a, b))

    def GCD(self, a, b):
        if a < b:
            temp = a
            a = b
            b = temp
        if a % b == 0:
            return b
        else:
            return self.GCD(b, a % b)

if __name__ == '__main__':
    p02256().main(None)