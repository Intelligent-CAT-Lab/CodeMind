class main:
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.IOException;
    import java.util.Set;
    import java.util.HashSet;
    import java.io.UncheckedIOException;
    import java.nio.charset.Charset;
    import java.util.StringTokenizer;
    import java.io.Writer;
    import java.io.OutputStreamWriter;
    import java.io.BufferedReader;
    import java.io.InputStream;
    
    class LightScanner:
        def __init__(self, in: InputStream):
            self.reader = BufferedReader(InputStreamReader(in))
            self.tokenizer = None
    
        def string(self) -> str:
            if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
                try:
                    self.tokenizer = StringTokenizer(self.reader.readLine())
                except IOException as e:
                    raise UncheckedIOException(e)
            return self.tokenizer.nextToken()
    
        def ints(self) -> int:
            return int(self.string())
    
    class LightWriter(Writer):
        def __init__(self, out: OutputStream):
            self.out = BufferedWriter(OutputStreamWriter(out, Charset.defaultCharset()))
            self.autoflush = False
            self.breaked = True
    
        def print(self, c: str) -> 'LightWriter':
            try:
                self.out.write(c)
                self.breaked = False
            except IOException as ex:
                raise UncheckedIOException(ex)
            return self
    
        def print(self, s: str) -> 'LightWriter':
            try:
                self.out.write(s, 0, s.length())
                self.breaked = False
            except IOException as ex:
                raise UncheckedIOException(ex)
            return self
    
        def ans(self, s: str) -> 'LightWriter':
            if not self.breaked:
                self.print(' ')
            return self.print(s)
    
        def ans(self, i: int) -> 'LightWriter':
            return self.ans(str(i))
    
        def ln(self) -> 'LightWriter':
            self.print(System.lineSeparator())
            self.breaked = True
            if self.autoflush:
                try:
                    self.out.flush()
                except IOException as ex:
                    raise UncheckedIOException(ex)
            return self
    
        def close(self) -> None:
            try:
                self.out.close()
            except IOException as ex:
                raise UncheckedIOException(ex)
    
    class Vec2i:
        def __init__(self, x: int, y: int):
            self.x = x
            self.y = y
    
        def equals(self, o: object) -> bool:
            if self == o: return True
            if o is None or type(self)!= type(o): return False
            vec2i = o
            return self.x == vec2i.x and