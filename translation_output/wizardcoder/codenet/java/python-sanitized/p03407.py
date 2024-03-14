import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class ATwoCoins:
    def solve(self, testNumber, in, out):
        out.println(in.nextInt() + in.nextInt() >= in.nextInt() and "Yes" or "No")

if __name__ == '__main__':
    inputStream = System.in
    outputStream = System.out
    in = Scanner(inputStream)
    out = PrintWriter(outputStream)
    solver = ATwoCoins()
    solver.solve(1, in, out)
    out.close()