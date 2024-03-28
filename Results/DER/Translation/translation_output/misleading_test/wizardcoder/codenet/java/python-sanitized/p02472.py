import java.io.InputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

class LightScanner:
    def __init__(self, inputStream):
        self.reader = BufferedReader(InputStreamReader(inputStream))
        self.tokenizer = None

    def string(self):
        if self.tokenizer == None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def bigints(self):
        return BigInteger(self.string())

class LightWriter:
    def __init__(self, outputStream):
        self.writer = BufferedWriter(OutputStreamWriter(outputStream))
        self.autoflush = False
        self.breaked = True

    def print(self, s):
        try:
            self.writer.write(s)
            self.breaked = False
        except IOException as e:
            raise UncheckedIOException(e)
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ansln(self, *n):
        for n1 in n:
            self.ans(n1).ln()
        return self

    def ln(self):
        self.print(System.lineSeparator())
        self.breaked = True
        if self.autoflush:
            try:
                self.writer.flush()
            except IOException as e:
                raise UncheckedIOException(e)
        return self

    def close(self):
        try:
            self.writer.close()
        except IOException as e:
            raise UncheckedIOException(e)

class NTL_2_A:
    def solve(self, testNumber, in, out):
        out.ansln(in.bigints().add(in.bigints()).toString())

def main(args):
    inputStream = System.in
    outputStream = System.out
    in = LightScanner(inputStream)
    out = LightWriter(outputStream)
    solver = NTL_2_A()
    solver.solve(1, in, out)
    out.close()

if __name__ == '__main__':
    main(None)