import java.io.*;
import java.util.*;

class p00400:

    def __init__(self):
        self.systemin = BufferedReader(InputStreamReader(System.in))
        self.log = PrintStream(OutputStream() { def write(self, b): pass })

    def main(self):
        sc = Scanner(systemin)
        N = sc.nextInt()
        r = 0
        if 'A' <= N and N <= 'Z':
            r = 1
        elif 'a' <= N and N <= 'z':
            r = 2
        result.printf("%d\n", r)
        sc.close()
        return False

if __name__ == '__main__':
    instance = p00400()
    instance.main()
    instance.systemin.close()