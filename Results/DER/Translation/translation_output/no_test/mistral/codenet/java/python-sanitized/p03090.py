import java.io.File
import java.math.BigInteger
import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Properties
import java.util.Scanner
import java.util.Set
import java.util.Stack

class p03090:
    static Scanner sc = Scanner(System.in)
    static Properties pps = System.getProperties()
    static bool dbg = true

    def main(args):
        # TODO Auto-generated method stub
        a = int(input())

        l = []
        solve(a, l)
        print(len(l))
        for str in l:
            print(str)

    def solve(a, l):
        # TODO Auto-generated method stub
        if a % 2 == 0:
            for i in range(1, a // 2 + 1):
                for j in range(i + 1, a // 2 + 1):
                    l.append(str(i) + " " + str(j))
                    l.append(str(i) + " " + (a - j + 1))
                    l.append((a - i + 1) + " " + str(j))
                    l.append((a - i + 1) + " " + (a - j + 1))
        else:
            solve(a - 1, l)
            for i in range(1, a):
                l.append(str(a) + " " + str(i))

    def out(l):
        # TODO Auto-generated method stub
        for i in l:
            print(i)

    def out(b):
        # TODO Auto-generated method stub
        for i in b:
            print(i)

    def out(s):
        # TODO Auto-generated method stub
        if dbg:
            print(s)

    def out(n):
        # TODO Auto-generated method stub
        if dbg:
            print(n)

    def ni():
        # TODO Auto-generated method stub
        return int(input())

    def ns():
        # TODO Auto-generated method stub
        return input().strip()

    def ni(k):
        # TODO Auto-generated method stub
        res = []
        for i in range(k):
            res.append(int(input()))
        res.append(input().strip())
        return res

    def ns(k):
        # TODO Auto-generated method stub
        res = []
        for i in range(k):
            res.append(input().strip())
        return res

    def ni(a, b):
        # TODO Auto-generated method stub
        res = []
        for i in range(a):
            for j in range(b):
                res.append(int(input()))
        res.append(input().strip())
        return res