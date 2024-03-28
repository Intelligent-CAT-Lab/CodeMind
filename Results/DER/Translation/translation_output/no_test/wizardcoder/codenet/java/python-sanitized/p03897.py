import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Set;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.io.UncheckedIOException;

class Vec2i:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __eq__(self, other):
        return self.x == other.x and self.y == other.y

    def __hash__(self):
        return hash((self.x, self.y))

    def __str__(self):
        return "({}, {})".format(self.x, self.y)

    def __lt__(self, other):
        if self.x == other.x:
            return self.y < other.y
        return self.x < other.x

class LightScanner:
    def __init__(self, in_stream):
        self.reader = BufferedReader(InputStreamReader(in_stream))
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def ints(self):
        return int(self.string())

class LightWriter:
    def __init__(self, out_stream):
        self.writer = BufferedWriter(OutputStreamWriter(out_stream, Charset.defaultCharset()))
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
        return self.print(str(s))

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

class JConnectedCheckerboard:
    def solve(self, test_number, in, out):
        n = in.ints()
        ans = set()
        for i in range(1, n, 2):
            ans.add(Vec2i(i, 0))
            ans.add(Vec2i(0, i))
        for i in range(n % 2, n, 2):
            ans