import java.io.*;
import java.util.*;

class p02198:

    def __init__(self):
        self.systemin = BufferedReader(InputStreamReader(System.in))
        self.log = PrintStream(OutputStream() { def write(self, b): pass })

    def main(self):
        sc = Scanner(systemin)

        N = sc.nextInt()
        M = sc.nextInt()

        System.out.printf("%d\n", N * M)

        sc.close()
        return False

if __name__ == '__main__':
    instance = p02198()
    instance.main()

    instance.systemin.close()