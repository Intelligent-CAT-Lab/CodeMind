import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStream;

class NTL_2_A:
    def solve(self, test_number, in, out):
        out.set_bool_label(LightWriter.BoolLabel.YES_NO_FIRST_UP)
        out.ansln(in.bigints().add(in.bigints()).toString())

class LightWriter(Writer):
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
    def __init__(self, in):
        self.reader = BufferedReader(InputStreamReader(in))

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def bigints(self):
        return BigInteger(self.string())