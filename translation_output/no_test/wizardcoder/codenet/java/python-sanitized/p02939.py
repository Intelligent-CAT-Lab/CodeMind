import java.io.*;
import java.util.*;

class p02939:
    scanner = Scanner()

    def main(self):
        s = self.scanner.next().toCharArray()
        n = len(s)
        count = 0
        for i in range(n):
            count += 1
            if i + 1 >= n:
                break
            if s[i] == s[i + 1]:
                if i + 2 >= n:
                    break
                i += 2
                count += 1
        print(count)

    class Scanner:
        def __init__(self):
            self.reader = BufferedReader(InputStreamReader(System.in), 1 << 15)
            self.tokenizer = None

        def next(self):
            while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
                self.tokenizer = StringTokenizer(self.reader.readLine())
            return self.tokenizer.nextToken()

        def nextInt(self):
            return int(self.next())

        def nextLong(self):
            return long(self.next())

        def nextDouble(self):
            return float(self.next())