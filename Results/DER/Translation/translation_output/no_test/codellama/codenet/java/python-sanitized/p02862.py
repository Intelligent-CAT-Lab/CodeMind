import java.io.*;
import java.util.*;
import java.math.*;
# import java.awt.Point;

class p02862:
    is = None
    out = None
    INPUT = ""

    mod = 1_000_000_007
    # mod = 998244353
    # long inf = Long.MAX_VALUE/2;
    inf = Integer.MAX_VALUE/2

    def solve(self):
        x = self.ni()
        y = self.ni()
        if (2*y-x)%3!=0 or 2*y-x<0:
            self.out.println(0)
            return
        a = (2*y-x)/3
        if (2*x-y)%3!=0 or 2*x-y<0:
            self.out.println(0)
            return
        b = (2*x-y)/3
        fif = self.enumFIF(3000000, self.mod)
        self.out.println(self.C(a+b,a,self.mod,fif))

    def C(self, n, r, mod, fif):
        if n < 0 or r < 0 or r > n: