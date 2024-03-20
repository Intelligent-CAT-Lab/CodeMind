import java.io.*;

class p02256:
    def main(self):
        br = BufferedReader(InputStreamReader(System.in))
        input = br.readLine().split(" ")
        a = int(input[0])
        b = int(input[1])

        System.out.println(self.GCD(a, b))

    def GCD(self, a, b):
        if a < b:
            temp = a
            a = b
            b = temp
        if a % b == 0:
            return b
        else:
            return self.GCD(b, a%b)