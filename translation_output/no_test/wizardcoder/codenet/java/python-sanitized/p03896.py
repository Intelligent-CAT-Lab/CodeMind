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

    def ans(self, i):
        return self.ans(str(i))

    def ans(self, *n):
        for n1 in n:
            self.ans(n1)
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

    def ints(self):
        return int(self.string())

class I3y3sChallenge:
    def solve(self, testNumber, in, out):
        # out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
        n = in.ints()
        if n == 2:
            out.ans(-1).ln()
            return
        ans = [[0 for j in range(n-1)] for i in range(n)]
        for i in range(n-1):
            for j in range(n-1):
                if i == j:
                    ans[i][j] = n
                else:
                    ans[i][j] = j+1
        for i in range(n-1):
            ans[n-1][i] = (i+1) % (n-1) + 1
        for i in range(n):
            out.ans(ans[i]).ln()

def main(args):
    inputStream = System.in
    outputStream = System.out
    in = LightScanner(inputStream)
    out = LightWriter(outputStream)
    solver = I3y3sChallenge()
    solver.solve(1, in, out)
    out.close()

if __name__ == '__main__':
    main(None)