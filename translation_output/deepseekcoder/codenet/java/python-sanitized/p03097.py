import java.io.*;
import java.util.*;

class ContestReader:
    def __init__(self, inp):
        self.reader = BufferedReader(InputStreamReader(inp))

    def next(self):
        while (self.tokenizer is None or not self.tokenizer.hasMoreTokens()):
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except Exception as e:
                raise RuntimeException(e)
        return self.tokenizer.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.reader.readLine()

    def nextInt(self, n):
        array = [0] * n
        for i in range(n):
            array[i] = self.nextInt()
        return array

    def nextLong(self, n):
        array = [0] * n
        for i in range(n):