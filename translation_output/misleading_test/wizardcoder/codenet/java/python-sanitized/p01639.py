import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

class p01639:
    def __init__(self):
        self.sc = Scanner(System.in)

    def run(self):
        self.n = self.sc.nextInt()
        self.k = self.sc.nextInt() - 1
        self.x0 = self.sc.nextLong()
        self.solve()

    def solve(self):
        if self.x0 == 0:
            self.println("0")
            return

        x = self.x0
        s = 10000
        count = [0] * s
        offset = pow(2, 63)
        M = s / pow(2, 64)
        for i in range(self.n):
            at = int((x + offset) * M)
            if at < 0:
                at = 0
            if at >= s:
                at = s - 1
            count[at] += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        sum = 0
        length = -1
        target = -1
        for i in range(s):
            if sum <= self.k and self.k < sum + count[i]:
                target = i
                length = count[i]
                break
            sum += count[i]

        if length == -1:
            self.println("0")
            return

        is = [0] * length
        x = self.x0
        now = 0
        for i in range(self.n):
            at = int((x + offset) * M)
            if at < 0:
                at = 0
            if at >= s:
                at = s - 1
            if at == target:
                is[now] = x
                now += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17

        is.sort()
        self.println(str(is[self.k - sum]))

    def println(self, s):
        System.out.println(s)

p01639().run()