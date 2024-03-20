import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.io.Writer;
import java.io.UncheckedIOException;
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

    def ans(self, l):
        return self.ans(str(l))

    def ans(self, i):
        return self.ans(str(i))

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

    def longs(self):
        return Long.parseLong(self.string())

class CDivisorGame:
    def solve(self, testNumber, in, out):
        Debug.enable("src")
        n = in.longs()
        pf = HashMap()
        for i in range(2, int(n**0.5)+1):
            c = 0
            while n % i == 0:
                n /= i
                c += 1
            if c > 0:
                pf.put(i, c)
        if n > 1:
            pf.put(n, 1)

        ans = 1
        for ent in pf.entrySet():
            ans *= (ent.getValue() + 1)
        out.ans(pf.size()).ans(ans - 1).ln()

class Debug:
    DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$"
    debugRegex = None
    enabled = False
    src = None

    @staticmethod
    def enable(s):
        enabled = True
        src = s
        if Debug.debugRegex == None:
            Debug.debugRegex = Pattern.compile(Debug.DEBUG_CALL_PATTERN)

if __name__ == '__main__':
    inputStream = System.in
    outputStream = System.out
    in = LightScanner(inputStream)
    out = LightWriter(outputStream)
    solver = CDivisorGame()
    solver.solve(1, in, out)
    out.close()