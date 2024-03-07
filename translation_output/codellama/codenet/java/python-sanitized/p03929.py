import java.util.*;
import java.io.*;
import java.math.*;

class p03929:
    def solve():
        one = nextIntArray()
        N = one[0]
        d = one[1]
        if N <= 2:
            myout(0)
            return
        N -= 3
        loop = N // 11
        amari = N % 11
        map = [[1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5], [0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5], [1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5], [0, 0, 1, 1, 2, 3, 3, 4, 4, 4, 5], [1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5], [0, 0, 1, 1, 1, 2, 2, 3, 4, 4, 5], [0, 1, 1, 2, 3, 3, 4, 4, 4, 5, 5], [1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5], [0, 1, 1, 1, 2, 2, 3, 4, 4, 5, 5], [1, 1, 2, 3, 3, 4, 4, 4, 5, 5, 5], [0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5]]
        myout(loop * 5 + map[d][amari])

    def next():
        return ii.next()

    def hasNext():
        return ii.hasNext()

    def nextInt():
        return Integer.parseInt(next())

    def nextLong():
        return Long.parseLong(next())

    def nextDouble():
        return Double.parseDouble(next())

    def nextStrArray():
        return myconv(next(), 8)

    def nextCharArray():
        return myconv(next(), 0)

    def nextIntArray():
        input = nextStrArray()
        ret = []
        for i in range(len(input)):
            ret.append(Integer.parseInt(input[i]))
        return ret

    def nextLongArray():
        input = nextStrArray()
        ret = []
        for i in range(len(input