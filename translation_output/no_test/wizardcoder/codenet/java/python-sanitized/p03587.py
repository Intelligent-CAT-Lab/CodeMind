import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class AAccepted:
    def solve(self, testNumber, in, out):
        s = in.next()
        n = 0
        for c in s:
            if c == '1':
                n += 1
        out.println(n)

class p03587:
    def main(self, args):
        inputStream = System.in
        outputStream = System.out
        in = Scanner(inputStream)
        out = PrintWriter(outputStream)
        solver = AAccepted()
        solver.solve(1, in, out)
        out.close()

if __name__ == '__main__':
    p03587().main(None)