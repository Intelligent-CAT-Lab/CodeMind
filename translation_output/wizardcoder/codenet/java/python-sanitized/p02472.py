import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStream;

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
            self.out.write(s, 0, s.length())
            self.breaked = False
        except IOException as ex:
            raise UncheckedIOException(ex)
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
    def __init__(self, in_):
        self.reader = BufferedReader(InputStreamReader(in_))
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def bigints(self):
        return BigInteger(self.string())

class NTL_2_A:
    def solve(self, testNumber, in_, out_):
        out_.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP)
        out_.ansln(in_.bigints().add(in_.bigints()).toString())

def main(args):
    inputStream = System.in
    outputStream = System.out
    in_ = LightScanner(inputStream)
    out_ = LightWriter(outputStream)
    solver = NTL_2_A()
    solver.solve(1, in_, out_)
    out_.close()

if __name__ == '__main__':
    main(None)