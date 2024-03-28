class main:
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.InputStreamReader;
    import java.io.BufferedWriter;
    import java.io.IOException;
    import java.io.OutputStreamWriter;
    import java.util.StringTokenizer;
    import java.io.Writer;
    import java.io.UncheckedIOException;
    import java.nio.charset.Charset;
    
    class AEquivalentResistance:
        def solve(self, testNumber, in, out):
            r1 = in.doubles()
            r2 = in.doubles()
            out.ans(1 / (1 / r1 + 1 / r2), 10).ln()
    
    class LightWriter:
        def __init__(self, out):
            self.out = out
            self.autoflush = False
            self.breaked = True
    
        def print(self, c):
            try:
                self.out.write(c)
                self.breaked = False
            except IOException as ex:
                raise UncheckedIOException(ex)
            return self
    
        def print(self, s):
            try:
                self.out.write(s, 0, len(s))
                self.breaked = False
            except IOException as ex:
                raise UncheckedIOException(ex)
            return self
    
        def ans(self, x, n):
            if not self.breaked:
                self.print(' ')
            if x < 0:
                self.print('-')
                x = -x
            x += 0.5 / (10 ** n)
            self.print(str((long) x)).print('.')
            x -= (long) x
            for i in range(n):
                x *= 10
                self.print(str((int) x)[0])
                x -= (int) x
            return self
    
        def ln(self):
            self.print(System.lineSeparator())
            self.breaked = True
            if self.autoflush:
                try:
                    self.out.flush()
                except IOException as ex:
                    raise UncheckedIOException(ex)
            return self
    
        def close(self):
            try:
                self.out.close()
            except IOException as ex:
                raise UncheckedIOException(ex)
    
    class LightScanner:
        def __init__(self, in):
            self.reader = BufferedReader(InputStreamReader(in))
            self.tokenizer = None
    
        def string(self):
            if self.tokenizer == None or not self.tokenizer.hasMoreTokens():
                try:
                    self.tokenizer = StringTokenizer(self.reader.readLine())
                except IOException as e:
                    raise UncheckedIOException(e)
            return self.tokenizer.nextToken()
    
        def doubles(self):
            return Double.parseDouble(self.string())
    
    def main(args):
        inputStream = System.in
        outputStream = System.out
        in = LightScanner(inputStream)
        out = LightWriter(outputStream)
        solver = AEquivalentResistance()
        solver.solve(1, in, out)
        out.close()
    
    if __name__ == '__main__':
        main(sys.argv)