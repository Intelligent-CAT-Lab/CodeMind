import java.io.BufferedOutputStream
import java.io.BufferedReader
import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.io.OutputStream
import java.io.PrintWriter
import java.math.BigInteger
import java.util.Arrays
import java.util.StringTokenizer

class Solve:
    def __init__(self, io):
        self.io = io
        self.n = 0
        self.k = 0
        self.a = []
        self.b = []
        self.f = []
        self.dp = []
        self.memoWaysToPair = []

    def waysToPair(self, x):
        if self.memoWaysToPair[x]!= -1:
            return self.memoWaysToPair[x]

        if x % 2 == 1:
            self.memoWaysToPair[x] = 0
        elif x == 0:
            self.memoWaysToPair[x] = 1
        else:
            self.memoWaysToPair[x] = self.waysToPair(x - 2) * (x - 1) % mod

        return self.memo