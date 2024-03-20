import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Collections;

class p03867:
    MOD = 1000000007

    # calcurate n^k
    def pow(self, n, k):
        ans = 1
        tmp = n
        while True:
            if k == 0:
                return ans
            if k % 2 == 1:
                ans = (ans * tmp) % self.MOD
            tmp = (tmp * tmp) % self.MOD
            k //= 2

    def divisors(self, n):
        list = ArrayList()
        for i in range(1, int(n**0.5)+1):
            if n % i == 0:
                list.add(i)
                if i!= n//i:
                    list.add(n//i)
        Collections.sort(list)
        return list

    def main(self):
        r = FS()
        N = r.nextInt()
        K = r.nextInt()
        divisor = self.divisors(N)
        num = [0]*len(divisor)
        tmpSum = 0
        for i in range(len(divisor)):
            num[i] = self.pow(K, (divisor.get(i)+1)//2)
            for j in range(i):
                if divisor.get(i) % divisor.get(j) == 0:
                    num[i] -= num[j]
            while num[i] < 0:
                num[i] += self.MOD
            tmpSum += num[i]
            tmpSum %= self.MOD
        ans = 0
        for i in range(len(divisor)):
            if num[i] < 0:
                num[i] += self.MOD
            num[i] %= self.MOD
        for i in range(len(divisor)):
            d = divisor.get(i)
            if d%2==0:
                ans += num[i]*d//2
            else:
                ans += num[i]*d
            ans %= self.MOD
        print(ans)

class FS:
    def __init__(self):
        self.in_ = System.in
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in_.read(self.buffer)
            except IOException as e:
                e.printStackTrace()
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def skipUnprintable(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skipUnprintable()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = StringBuilder