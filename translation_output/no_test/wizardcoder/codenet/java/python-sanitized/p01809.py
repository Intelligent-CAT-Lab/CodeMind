import java.util.ArrayList
import java.util.Scanner

class p01809:
    def main(self):
        yaku = ArrayList()

        scn = Scanner(System.in)
        p = scn.nextLong()
        q = scn.nextLong()
        scn.close()
        qs = q
        ans = 1
        bp = p
        bq = q
        buf = p

        while bq % bp!= 0:
            buf = bq % bp
            bq = bp
            bp = buf

        qs = q/buf
        for i in range(2,int(Math.sqrt(qs))+1):
            if qs % i == 0:
                while qs % i == 0:
                    qs /= i
                ans *= i

        ans *= qs
        System.out.println(ans)

p01809().main()