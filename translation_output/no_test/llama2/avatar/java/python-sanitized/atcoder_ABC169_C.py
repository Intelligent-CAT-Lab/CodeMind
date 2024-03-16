import java.util
import java.io

class atcoder_ABC169_C:
    def main(self, args):
        sc = java.util.Scanner(java.io.System.in)
        a = sc.nextLong()
        b = sc.nextDouble()
        c = (long)(b * 100)
        d = a * c
        print(d / 100)