import java.util.ArrayList;
import java.util.Scanner;

class p01809:
    def __init__(self):
        self.yaku = []

    def main(self, args):
        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q // p
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp != 0:
            buf = bq % bp
            bq = bp
            bp = buf

        while True:
            i = 2
            while i <= math.sqrt(qs):
                if qs % i == 0:
                    while qs % i == 0:
                        qs //= i
                    ans *= i
                else:
                    break
            else:
                break
        ans *= qs
        print(ans)