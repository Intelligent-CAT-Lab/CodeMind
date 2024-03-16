import java.io.PrintStream
import java.util.Scanner

class p03304:
    so = java.io.PrintStream(System.out)
    sc = Scanner(System.in)

    def main(self, args):
        n = sc.nextLong()
        m = sc.nextLong()
        d = sc.nextLong()
        
        s = d == 0 and n or ((n - d) * 2)
        so.println((double) s/n/n*(m-1))

p03304().main(None)