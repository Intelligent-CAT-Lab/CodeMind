import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.StringTokenizer;

class p02331:
    def main(self, args):
        sc = SC(System.in)
        #åºå¥ã§ãããã¼ã«ãåºå¥ã§ããç®±ã«å
¥ããå
¥ãæ¹ã¯ã
        #1ã¤ã®ãã¼ã«ã«ä»ããç®±ã®åæ°éãæããããããç¬ç«ãªã®ã§ã
        #n kãä¸ããããæ k^nã§ããã
        MOD = 1000000007
        n = sc.nextLong()
        k = sc.nextLong()
        ans = 1
        for i in range(n):
            ans = (ans * k) % MOD
        self.pl(ans)

    def pl(self, o):
        System.out.println(o)

    def pl(self):
        System.out.println()

    def p(self, o):
        System.out.print(o)

    class SC:
        def __init__(self, in_):
            self.reader = BufferedReader(InputStreamReader(in_))
            self.tokenizer = None

        def next(self):
            if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                try:
                    self.tokenizer = StringTokenizer(self.reader.readLine())
                except IOException as e:
                    raise UncheckedIOException(e)
            return self.tokenizer.nextToken()

        def nextInt(self):
            return Integer.parseInt(self.next())

        def nextLong(self):
            return Long.parseLong(self.next())

        def nextDouble(self):
            return Double.parseDouble(self.next())

        def nextLine(self):
            try:
                return self.reader.readLine()
            except IOException as e:
                raise UncheckedIOException(e)

p02331().main(None)