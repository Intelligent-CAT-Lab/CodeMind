class main:
    import java.io.ByteArrayInputStream
    import java.io.IOException
    import java.io.InputStream
    import java.io.PrintWriter
    import java.util.ArrayList
    import java.util.Arrays
    import java.util.InputMismatchException
    import java.util.List
    
    class p03769:
        is = None
        out = None
        INPUT = ""
    
        def solve(self):
            n = self.nl()
            perm = self.permutationWhoseNumberOfIncreasingSequenceIsK(n)
            self.out.println(perm.size() * 2)
            for i in range(1, perm.size() + 1):
                if i > 1:
                    self.out.print(" ")
                self.out.print(i)
            for i in range(perm.size()):
                self.out.print(" ")
                self.out.print(perm.get(i) + 1)
            self.out.println()
    
        def permutationWhoseNumberOfIncreasingSequenceIsK(self, K):
            cur = (1 << 63) - 1
            list = ArrayList()
            for i in range(64):
                if (cur & (1 << i))!= 0:
                    list.add(i)
            p = list.size()
            for d in range(63, -1, -1):
                x = 1 << d
                if cur + x <= K:
                    cur += x
                    list.add(d, p)
                    p += 1
            return list
    
        def main(self, args):
            S = System.currentTimeMillis()
            self.is = INPUT.isEmpty() and System.in or ByteArrayInputStream(INPUT.getBytes())
            self.out = PrintWriter(System.out)
    
            self.solve()
            self.out.flush()
            G = System.currentTimeMillis()
            self.tr(G - S + "ms")
    
        def eof(self):
            if self.lenbuf == -1