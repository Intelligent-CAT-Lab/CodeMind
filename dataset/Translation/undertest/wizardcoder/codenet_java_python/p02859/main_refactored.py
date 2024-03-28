class main:
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.IOException;
    import java.util.InputMismatchException;
    
    class ACircle:
        def solve(self, testNumber, in, out):
            r = in.nextInt()
            out.println(r * r)
    
    class InputReader:
        def __init__(self, stream):
            self.stream = stream
            self.buf = bytearray(1024)
            self.curChar = 0
            self.numChars = 0
            self.filter = None
    
        def read(self):
            if self.numChars == -1:
                raise InputMismatchException()
            if self.curChar >= self.numChars:
                self.curChar = 0
                try:
                    self.numChars = self.stream.read(self.buf)
                except IOException as e:
                    raise InputMismatchException()
                if self.numChars <= 0:
                    return -1
            return self.buf[self.curChar]
    
        def nextInt(self):
            c = self.read()
            while self.isSpaceChar(c):
                c = self.read()
            sgn = 1
            if c == '-':
                sgn = -1
                c = self.read()
            res = 0
            while not self.isSpaceChar(c):
                if c < '0' or c > '9':
                    raise InputMismatchException()
                res *= 10
                res += c - '0'
                c = self.read()
            return res * sgn
    
        def isSpaceChar(self, c):
            if self.filter!= None:
                return self.filter.isSpaceChar(c)
            return self.isWhitespace(c)
    
        def isWhitespace(self, c):
            return c =='' or c == '\n' or c == '\r' or c == '\t' or c == -1
    
        class SpaceCharFilter:
            def isSpaceChar(self, ch):
                return ch =='' or ch == '\n' or ch == '\r' or ch == '\t' or ch == -1
    
    class OutputWriter:
        def __init__(self, outputStream):
            self.writer = PrintWriter(BufferedWriter(OutputStreamWriter(outputStream)))
    
        def close(self):
            self.writer.close()
    
        def println(self, i):
            self.writer.println(i)
    
    def main(args):
        inputStream = System.in
        outputStream = System.out
        in = InputReader(inputStream)
        out = OutputWriter(outputStream)
        solver = ACircle()
        solver.solve(1, in, out)
        out.close()
    
    if __name__ == '__main__':
        main(sys.argv)