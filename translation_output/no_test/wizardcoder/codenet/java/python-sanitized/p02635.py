import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.InputStream;

class p02635:
    class CShift:
        MOD = 998244353

        def solve(self, testNumber, in, out):
            str = in.chars()
            k = in.ints()
            a = []
            n = 0
            for i in range(len(str)-1, -1, -1):
                if str[i] == '0':
                    a.append(n)
                    n = 0
                else:
                    n += 1
            a.append(n)
            n = len(a)
            ones = n - 1
            zeros = len(str) - ones
            if ones == 0 or zeros ==